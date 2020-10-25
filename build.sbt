name := "squants-study"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.3"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-feature",
  "-deprecation"
)

val kindProjectorVersion = "0.11.0"

fork := true
//autoCompilerPlugins := true

libraryDependencies := Seq(
  "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  "org.scalatest" %% "scalatest-funspec" % "3.2.0" % "test",
  compilerPlugin(("org.typelevel" %% "kind-projector" % kindProjectorVersion).cross(CrossVersion.full)),
  ("org.typelevel" %% "squants" % "1.6.0").withSources().withJavadoc()
)
