package fizz.buzz.whizz

case class Contains(n: Int, word: String) extends Rule {
  def apply(m: Int): String =
    if (m.toString.contains(n.toString)) word else ""
}