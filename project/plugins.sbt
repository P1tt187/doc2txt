logLevel := Level.Warn

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.url("sbt snapshot plugins", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns),
  Resolver.sonatypeRepo("snapshots"),
  "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "spray repo" at "http://repo.spray.io",
  "jitpack.io" at "https://jitpack.io/",
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0")
