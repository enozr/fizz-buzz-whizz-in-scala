package fizz.buzz.whizz

object Rule {
  type Rule = Int => String

  def times(n: Int, word: String): Rule =
    m => if (m % n == 0) word else ""

  def contains(n: Int, word: String): Rule =
    m => if (m.toString.contains(n.toString)) word else ""

  def default: Rule =
    m => m.toString

  def allof(rules: Rule*): Rule =
    m => rules.foldLeft("") { _ + _(m) }

  def anyof(rules: Rule*): Rule =
    m => rules.map(_(m)).filterNot(_.isEmpty).headOption.getOrElse("")
}