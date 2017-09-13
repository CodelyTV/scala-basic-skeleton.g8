package $package$

import org.scalatest._
import org.scalatest.Matchers._

final class $name;format="Camel"$Test extends WordSpec with GivenWhenThen {
  "$name;format="Camel"$" should {
    "greet" in {
      Given("a $name;format="Camel"$")

      val $name;format="camel"$ = new $name;format="Camel"$

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = $name;format="camel"$.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
