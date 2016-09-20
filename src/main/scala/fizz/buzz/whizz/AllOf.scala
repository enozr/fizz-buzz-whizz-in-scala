package fizz.buzz.whizz

case class AllOf(times: Times*) {
  def apply(n: Int): String =
    times.foldLeft("") { (acc, t) => acc + t.apply(n) }
}