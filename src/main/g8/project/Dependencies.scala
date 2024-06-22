import sbt._

object Dependencies {
  private val prod = Seq(
    "com.github.nscala-time" %% "nscala-time" % "$nscala-time_version$",
    "com.lihaoyi"            %% "pprint"      % "$pprint_version$"
  )

  private val test = Seq(
    "org.scalatest" %% "scalatest" % "$scalatest_version$",
    "org.scalamock" %% "scalamock" % "$scalamock_version$"
  ).map(_ % Test)

  val all = prod ++ test
}
