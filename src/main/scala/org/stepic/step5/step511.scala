package org.stepic.step5

import scala.io.StdIn.readLine

object step511 extends App {
  def mutuallySimple() = {
    val n = readLine().toInt
    for (i <- Range(1, n); j <- Range(1, n)) {
      if (i == j - 1) println(s"$i $j")
      else if (BigInt.apply(i).gcd(BigInt.apply(j)) == 1) println(s"$i $j")
    }
  }
}
