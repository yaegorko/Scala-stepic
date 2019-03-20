package org.stepic.step3

import scala.io.StdIn

object step341 {
  def main(args: Array[String]) {
    val index = StdIn.readLine().split(" ": String)
    val string = StdIn.readLine()
    val subString = string.slice(index(0).toInt, index(1).toInt + 1)
    println(string.replaceFirst(subString, subString.reverse))
  }
}
