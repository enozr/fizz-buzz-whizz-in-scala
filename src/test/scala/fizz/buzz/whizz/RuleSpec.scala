package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("fizz buzz whizz: using factory") {
    import Rule.{times, contains, default, allof, anyof}

    it ("times(3) => Fizz") {
      times(3, "Fizz")(3*2) should be("Fizz")
    }

    it ("contains(3) => Fizz") {
      contains(3, "Fizz")(13) should be("Fizz")
    }

    it ("default rule" ) {
      default(2) should be("2")
    }

    it ("times(3) && times(5) -> FizzBuzz" ) {
      allof(times(3, "Fizz"), times(5, "Buzz"))(3*5) should be("FizzBuzz")
    }

    it ("times(3) -> Fizz || times(5) -> Buzz" ) {
      anyof(times(3, "Fizz"), times(5, "Buzz"))(3*5) should be("Fizz")
    }
  }

  describe("fizz buzz whizz: extract atom") {
    import Rule.atom
    import Matcher.{times, contains}
    import Action.to

    it ("times(3) => Fizz") {
      atom(times(3), to("Fizz"))(3*2) should be("Fizz")
    }

    it ("contains(3) => Fizz") {
      atom(contains(3), to("Fizz"))(13) should be("Fizz")
    }
  }
}