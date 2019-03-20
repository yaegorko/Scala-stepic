package org.stepic.step3

object step321 extends App {

  import scala.math.BigDecimal.RoundingMode.HALF_UP

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {

    val potatoWaterRatioBigDec = BigDecimal.decimal(potatoWaterRatio).setScale(5, HALF_UP)
    val crispsWaterRatioBigDec = BigDecimal.decimal(crispsWaterRatio).setScale(5, HALF_UP)
    var res: BigDecimal = 0


    res = weight - weight * potatoWaterRatioBigDec
    res = res / (1 - crispsWaterRatioBigDec)

    res.setScale(5, HALF_UP)
  }

}

