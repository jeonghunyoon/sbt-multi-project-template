name := "sbt-multi-projects"

version := "1.0"

scalaVersion := "2.12.1"

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.example",
  scalaVersion := "2.12.1"
)

lazy val template = (project in file("template"))
  .settings(commonSettings: _*)
  .settings(
    assemblyJarName in assembly := "template.jar"
  )