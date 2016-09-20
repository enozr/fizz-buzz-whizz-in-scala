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
      import Default.default
      default(2) should be("2")
    }

    it ("times(3) && times(5) -> FizzBuzz" ) {
      AllOf(Times(3, "Fizz"), Times(5, "Buzz"))(3*5) should be("FizzBuzz")
    }

    it ("times(3) -> Fizz || times(5) -> Buzz" ) {
      AnyOf(Times(3, "Fizz"), Times(5, "Buzz"))(3*5) should be("Fizz")
    }
  }
}