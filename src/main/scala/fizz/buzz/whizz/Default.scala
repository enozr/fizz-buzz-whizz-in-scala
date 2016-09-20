package fizz.buzz.whizz

class Default extends Rule {
  def apply(m: Int) = m.toString
}

object Default {
  def default = new Default
}