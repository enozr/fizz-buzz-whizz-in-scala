package fizz.buzz.whizz

case class AnyOf(times: Times*) {
  def apply(m: Int): String =
    times.map(_(m)).filterNot(_.isEmpty).headOption.getOrElse("")
}
