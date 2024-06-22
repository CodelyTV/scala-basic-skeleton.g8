lazy val root = (project in file("."))
  .settings(
    name := "Codely Scala Basic Skeleton",
    version := "1.6.0",

    organization := "com.codely",
    organizationName := "Codely Enseña y Entretiene SL",
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

/** ********* COMMANDS ALIASES ******************/
addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
addCommandAlias("tq", "testQuick")
addCommandAlias("tsf", "testShowFailed")

addCommandAlias("c", "compile")
addCommandAlias("tc", "Test / compile")

addCommandAlias("f", "scalafmt") // Format production files according to ScalaFmt
addCommandAlias("fc", "scalafmtCheck") // Check if production files are formatted according to ScalaFmt
addCommandAlias("tf", "Test / scalafmt") // Format test files according to ScalaFmt
addCommandAlias("tfc", "Test / scalafmtCheck") // Check if test files are formatted according to ScalaFmt

// All the needed tasks before pushing to the repository (compile, compile test, format check in prod and test)
addCommandAlias("prep", ";c;tc;fc;tfc")
