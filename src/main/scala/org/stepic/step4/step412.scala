package org.stepic.step4

object step412 extends App {

  def getGift() : Int = {
    println("The gift is received")
    100
  }

  def sendGift(currentAmount: Int, gift: => Int) = {
    if (currentAmount >= 500) {
      currentAmount + gift
    }
    else
      currentAmount
  }

  val accountAmounts = List(100, 200, 500, 300, 700)

  val newAmounts = accountAmounts.map(amount => sendGift(amount, getGift()))
  println(newAmounts)
}
