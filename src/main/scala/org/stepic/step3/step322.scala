package org.stepic.step3

import scala.io.StdIn.readLine

object step322 extends App{

  val number = readLine().toInt
  println(Integer.bitCount(number))

}
