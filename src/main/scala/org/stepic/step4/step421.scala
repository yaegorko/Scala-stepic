package org.stepic.step4

object step421 extends App {

  def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
    array.filter(cond)
  }

  val searchOdd: List[Int] => List[Int] = searchInArray(_ % 2 == 1, _)

  println(searchOdd(List(8,11,12)))

}
