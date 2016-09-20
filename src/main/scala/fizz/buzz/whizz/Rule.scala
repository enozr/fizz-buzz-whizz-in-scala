package fizz.buzz.whizz

object Rule {
  type Rule = Int => String

  import Matcher.Matcher
  import Action.Action

  def atom(matcher: => Matcher, action: => Action): Rule =
    m => if (matcher(m)) action(m) else ""

  def allof(rules: Rule*): Rule =
    m => rules.foldLeft("") { _ + _(m) }

  def anyof(rules: Rule*): Rule =
    m => rules.map(_(m)).filterNot(_.isEmpty).headOption.getOrElse("")
}