package com.lightbend.gsa

import akka.actor.ActorSystem
import akka.stream.scaladsl.{RestartSource, Sink, Source}

import scala.concurrent.duration.DurationInt

object Main extends App {
  implicit val system: ActorSystem = ActorSystem("telemetry")

  Source.repeat(0)
    .map(_ + 1).named("increment")
    .throttle(1,1.seconds).named("throttle")
    .to(Sink.ignore)
    .named("simple-test")
    .run()

}