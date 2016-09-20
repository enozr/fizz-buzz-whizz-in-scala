package fizz.buzz.whizz

trait Rule {
  def apply(n: Int): String
}

object Rule {
  def times(n: Int, word: String): Int => String =
    m => if (m % n == 0) word else ""

  def contains(n: Int, word: String): Int => String =
    m => if (m.toString.contains(n.toString)) word else ""

  def default: Int => String =
    m => m.toString

  def allof(rules: (Int => String)*): Int => String =
    m => rules.foldLeft("") { _ + _(m) }

  def anyof(rules: (Int => String)*): Int => String =
    m => rules.map(_(m)).filterNot(_.isEmpty).headOption.getOrElse("")
}