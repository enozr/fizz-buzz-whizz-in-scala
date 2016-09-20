package fizzbuzz.app

import fizzbuzz.core.Game

object Main extends App {
  def start(n: Int)(n1: Int, n2: Int, n3: Int): Unit = {
    val saying = Game.spec(n1, n2, n3)
    (1 to n) foreach { n => println(s"${n} -> ${saying(n)}") }
  }

  start(100)(3, 5, 7)
}