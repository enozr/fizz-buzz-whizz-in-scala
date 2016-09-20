package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("fizz buzz whizz: extract atom") {
    import Rule.{atom, allof, anyof}
    import Matcher.{times, contains, always}
    import Action.{to, nop}

    it ("times(3) => Fizz") {
      atom(times(3), to("Fizz"))(3*2) should be("Fizz")
    }

    it ("contains(3) => Fizz") {
      atom(contains(3), to("Fizz"))(13) should be("Fizz")
    }

    it ("default rule" ) {
      atom(always(true), nop)(2) should be("2")
    }

    it ("times(3) && times(5) -> FizzBuzz" ) {
      allof(atom(times(3), to("Fizz")), atom(times(5), to("Buzz")))(3*5) should be("FizzBuzz")
    }

    it ("times(3) -> Fizz || times(5) -> Buzz" ) {
      anyof(atom(times(3), to("Fizz")), atom(times(5), to("Buzz")))(3*5) should be("Fizz")
    }
  }
}

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class RuleSpec2 extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val specs = Table(
    ("n",         "expect"),
    (3,           "Fizz"),
    (5,           "Buzz"),
    (7,           "Whizz"),
    (3 * 5,       "FizzBuzz"),
    (3 * 7,       "FizzWhizz"),
    ((5 * 7) * 2, "BuzzWhizz"),
    (3 * 5 * 7,   "FizzBuzzWhizz"),
    (13,          "Fizz"),
    (35/*5*7*/,   "Fizz"),
    (2,           "2")
  )

  property("fizz buzz whizz") {
    val spec = Game.spec(3, 5, 7)
    forAll(specs) { spec(_) should be (_) }
  }
}
