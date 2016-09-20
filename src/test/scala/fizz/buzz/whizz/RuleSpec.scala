package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("fizz buzz whizz") {
    it ("times(3) => Fizz") {
      new Times(3, "Fizz").apply(3*2) should be("Fizz")
    }
  }
}