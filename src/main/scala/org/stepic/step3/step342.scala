package org.stepic.step3

import scala.io.StdIn

object step342 extends App {
  def checkExpression(): Boolean =
  {
//    val string = StdIn.readLine()
//    val expression = "[a-z]+(_[a-z]+)*"
//    string.matches(expression)
    StdIn.readLine().matches("[a-z]+(_[a-z]+)*")
  }
}
