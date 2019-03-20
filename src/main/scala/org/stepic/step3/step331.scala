package org.stepic.step3

object step331 extends App {
  def isCapital(word: String, pos: Int): Boolean = {
     word.charAt(pos).toInt.>=(65) & word.charAt(pos).toInt.<=(90)
    //    word(pos).isUpper - самое короткое
  }
}
