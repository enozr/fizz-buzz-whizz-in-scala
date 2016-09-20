package fizz.buzz.whizz

object Matcher {
  def times(n: Int): Int => Boolean = _ % n == 0
  def contains(n: Int): Int => Boolean = _.toString.contains(n.toString)
}
