lazy val commonSettings = Seq(
  scalaVersion := "2.12.3",
  scalafmtOnCompile := true,
  organization := "$organization$",
  description := "$description$",
  licenses := Seq("GPL" → url("$project_url$/license.md")),
  resolvers += "jitpack" at "https://jitpack.io",
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint"),
  autoAPIMappings := true
)

lazy val `$name_norm$` = project
  .settings(
    commonSettings,
    libraryDependencies ++= {
      Seq(

      )
    }
  )
  .enablePlugins(GenJavadocPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    commonSettings,
    scalacOptions in (ScalaUnidoc, unidoc) += "-Ymacro-expand:none"
  )
  .enablePlugins(ScalaUnidocPlugin, JavaUnidocPlugin)
  .aggregate(`$name_norm$`)
