import sbt.{Compile, Test, TestFrameworks, Tests, singleFileFinder, Configuration => _}
import sbt.Keys.*
import sbt.io.syntax.file


object ProjectConfiguration {
   val settings = Seq(
     organization := "$organization$",
     scalaVersion := "$scala_version$",

    // Custom folders path (remove the `/scala` default subdirectory)
    Compile / scalaSource := file((baseDirectory.value / "src" / "main").toString),
    Test / scalaSource := file((baseDirectory.value / "src" / "test").toString),

    // Compiler options
    scalacOptions ++= Seq(
      "-deprecation", // Warnings deprecation
      "-feature", // Advise features
      "-unchecked", // More warnings. Strict
      "-Xlint", // More warnings when compiling
      "-Ywarn-dead-code",
      "-Ywarn-unused"
    ),
    Test / scalacOptions += "-Xcheckinit", // Check against early initialization only in tests because it's expensive
    javaOptions += "-Duser.timezone=UTC",

    // Test options
    Test / parallelExecution := false,
    Test / testForkedParallel := false,
    Test / fork := true,
    Test / testOptions ++= Seq(
      Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports"), // Save test reports
      Tests.Argument("-oDF") // Show full stack traces and time spent in each test
    )
  )
}
