package org.stepic.step4

object step432 extends App {

  def middle[T](data: Iterable[T]) = {
    data.toStream.splitAt(data.size / 2)._2.head
  }
}
