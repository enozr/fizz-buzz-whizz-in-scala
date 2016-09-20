package fizz.buzz.whizz

case class Times(n: Int, word: String) {
  def apply(m: Int): String = if (m % n == 0) word else ""
}
