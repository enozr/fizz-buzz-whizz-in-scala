package fizz.buzz.whizz

class Default {
  def apply(m: Int) = m.toString
}

object Default {
  def default = new Default
}