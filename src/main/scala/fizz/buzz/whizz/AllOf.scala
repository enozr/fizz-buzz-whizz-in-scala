package fizz.buzz.whizz

case class AllOf(rules: Rule*) extends Rule {
  def apply(n: Int): String =
    rules.foldLeft("") { _ + _(n) }
}