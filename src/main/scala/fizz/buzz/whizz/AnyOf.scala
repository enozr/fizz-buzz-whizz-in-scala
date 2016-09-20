package fizz.buzz.whizz

case class AnyOf(times: Times*) {
  def apply(n: Int): String = "Fizz"
}
