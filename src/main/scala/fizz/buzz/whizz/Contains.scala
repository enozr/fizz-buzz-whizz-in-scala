package fizz.buzz.whizz

case class Contains(n: Int, word: String) {
  def apply(m: Int): String =
    if (m.toString.contains(n.toString)) word else ""
}