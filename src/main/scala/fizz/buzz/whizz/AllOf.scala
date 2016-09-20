package fizz.buzz.whizz

case class AllOf(times: Times*) {
  def apply(n: Int): String =
    times.foldLeft("") { _ + _(n) }
}