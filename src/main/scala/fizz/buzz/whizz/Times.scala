package fizz.buzz.whizz

case class Times(n: Int, word: String) extends Rule {
  def apply(m: Int): String = if (m % n == 0) word else ""
}
