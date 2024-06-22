object SbtAliases {
  val aliases: Seq[(String, String)] = Seq(
    "t"   -> "test",
    "to"  -> "testOnly",
    "tq"  -> "testQuick",
    "tsf" -> "testShowFailed",
    "c"   -> "compile",
    "tc"  -> "Test / compile",
    "f"   -> "scalafmt",             // Format production files according to ScalaFmt
    "fc"  -> "scalafmtCheck",        // Check if production files are formatted according to ScalaFmt
    "tf"  -> "Test / scalafmt",      // Format test files according to ScalaFmt
    "tfc" -> "Test / scalafmtCheck", // Check if test files are formatted according to ScalaFmt
    "prep" -> ";c;tc;fc;tfc" // All the needed tasks before pushing to the repository (compile, compile test, format check in prod and test)
  )
}
