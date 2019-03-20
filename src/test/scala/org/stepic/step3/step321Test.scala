package org.stepic.step3

import org.scalatest.FunSuite

class step321Test extends FunSuite {
  assert(step321.crispsWeight(BigDecimal("90"), 0.9, 0.1 ) === 10)
}
