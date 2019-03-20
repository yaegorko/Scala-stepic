package org.stepic.step2

import scala.io.StdIn

object step231 {
  def main(args: Array[String]): Unit = {
    val int1 = StdIn.readLine().split(" ": String)
    print(int1(0).toInt - int1(1).toInt)
  }
}