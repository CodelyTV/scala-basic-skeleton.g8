Settings.settings

libraryDependencies := Dependencies.all


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
