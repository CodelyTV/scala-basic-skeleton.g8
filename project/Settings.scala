import sbt.{Compile, Configuration => _, Resolver, Test, TestFrameworks, Tests}
import sbt.ScriptedPlugin.autoImport.scriptedLaunchOpts
import sbt.Keys._
import sbt.io.syntax._

object Settings {
  val settings = Seq(
    name                 := "Codely Scala Basic Skeleton",
    version              := "1.7.0",
    organization         := "com.codely",
    organizationName     := "Codely Enseña y Entretiene SL",
    organizationHomepage := Some(url("https://codely.com")),
    scriptedLaunchOpts ++= List(
      "-Xms1024m",
      "-Xmx1024m",
      "-Xss2m",
      "-Dfile.encoding=UTF-8"
    ),
    resolvers += Resolver.url(
      "typesafe",
      url("https://repo.typesafe.com/typesafe/ivy-releases/")
    )(Resolver.ivyStylePatterns)
  )
}
