package fizz.buzz.whizz

class Times(n: Int, word: String) {
  def apply(m: Int): String = if (m % n == 0) word else ""
}
