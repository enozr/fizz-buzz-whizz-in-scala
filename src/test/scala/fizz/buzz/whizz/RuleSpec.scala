package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("fizz buzz whizz") {
    it ("times(3) => Fizz") {
      Times(3, "Fizz")(3*2) should be("Fizz")
    }

    it ("contains(3) => Fizz") {
      Contains(3, "Fizz")(13) should be("Fizz")
    }

    it ("default rule" ) {
      Default()(2) should be("2")
    }
  }
}