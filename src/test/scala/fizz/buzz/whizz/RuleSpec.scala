package fizz.buzz.whizz

import org.scalatest.{FunSpec, Matchers}

class RuleSpec extends FunSpec with Matchers {
  describe("World") {
    it ("should not be work" ) {
      true should be(false)
    }
  }
}