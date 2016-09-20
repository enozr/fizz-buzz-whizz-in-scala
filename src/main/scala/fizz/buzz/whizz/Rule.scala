package fizz.buzz.whizz

trait Rule {
  def apply(n: Int): String
}

object Rule {
  def times(n: Int, word: String): Int => String =
    m => if (m % n == 0) word else ""

  def contains(n: Int, word: String): Int => String =
    m => if (m.toString.contains(n.toString)) word else ""
}