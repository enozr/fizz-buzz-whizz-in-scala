package fizz.buzz.whizz

case class AllOf(times: Times*) {
  def apply(n: Int): String = {
    val result = new StringBuilder
    times.foreach { t => result.append(t.apply(n)) }
    result.toString
  }
}