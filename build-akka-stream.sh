sbt "set every targetSystemJdk := true" "set every scalaVersion := \"2.12.16\"" "akka-stream / compile" "akka-stream / package"
cp ./akka-stream/target/scala-2.12/akka-stream_2.12-2.6.21*.jar "$OTOROSHI_HOME/otoroshi/lib/"
