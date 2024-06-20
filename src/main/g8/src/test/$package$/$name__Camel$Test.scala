package $package$

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should._

final class $name;format="Camel"$Test extends AnyWordSpec with Matchers {
  "$name;format="Camel"$" should {
    "greet" in {
      val $name;format="camel"$ = new $name;format="Camel"$

      val nameToGreet = "Codely"
      val greeting = $name;format="camel"$.greet(nameToGreet)

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
