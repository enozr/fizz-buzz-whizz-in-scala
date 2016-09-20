package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("fizz buzz whizz") {
    it ("times(3) => Fizz") {
      Times(3, "Fizz")(3*2) should be("Fizz")
    }
  }
}