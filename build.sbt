name := "telemetry-akkastreams"

version := "0.1"

scalaVersion := "2.13.8"

idePackagePrefix := Some("com.lightbend.gsa")

logLevel := Level.Debug

val AkkaVersion = "2.6.18"
val PrometheusSimpleClient = "0.11.0"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
libraryDependencies += Cinnamon.library.cinnamonAkkaStream
libraryDependencies += Cinnamon.library.cinnamonPrometheus
libraryDependencies += Cinnamon.library.cinnamonPrometheusHttpServer
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += "io.prometheus" % "simpleclient" % PrometheusSimpleClient
libraryDependencies += "io.prometheus" % "simpleclient_common" % PrometheusSimpleClient
libraryDependencies += "io.prometheus" % "simpleclient_httpserver" % PrometheusSimpleClient

enablePlugins (Cinnamon)
run / cinnamon := true
test / cinnamon := true
cinnamonLogLevel := "INFO"
cinnamonSuppressRepoWarnings := true
