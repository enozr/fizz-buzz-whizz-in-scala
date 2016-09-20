package fizz.buzz.whizz

case class AnyOf(rules: Rule*) extends Rule {
  def apply(m: Int): String =
    rules.map(_(m)).filterNot(_.isEmpty).headOption.getOrElse("")
}
