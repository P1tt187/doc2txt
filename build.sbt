import com.typesafe.sbt.SbtNativePackager.autoImport._

name := "doc2text"

version := "1.1"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.apache.poi" % "poi-scratchpad" % "3.13"
)

mainClass := Some("p1tt187.doc2text.Doc2TextApp")

lazy val root = (project in file(".")).enablePlugins(JDKPackagerPlugin)

maintainer := "Fabian Markert <f.markert87@gmail.com>"

jdkPackagerType := "all"