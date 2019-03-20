package org.stepic.step2

import scala.io.StdIn

object step232 extends App {
  var int1 = StdIn.readLine().split(" ":String)
  print(int1(0).toInt * int1(1).toInt * int1(2).toInt)
}
