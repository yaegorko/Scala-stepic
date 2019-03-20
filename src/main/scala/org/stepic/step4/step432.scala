package org.stepic.step4

object step432 extends App {

  def middle[T](data: Iterable[T]) = {

    val half = data.size / 2: Int
    val split = data.splitAt(half: Int): (Iterable[T], Iterable[T])
    val split2 = split._2: Iterable[T]
    split2.head
  }

  println(require(middle("Scala") == 'a'))
  require(middle(Seq(1, 7, 5, 9)) == 5)

}
