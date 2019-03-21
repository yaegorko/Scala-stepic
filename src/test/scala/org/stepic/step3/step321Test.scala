package org.stepic.step3

import org.scalatest.FunSuite

class step321Test extends FunSuite {
  test("test321") {
    assert(step321.crispsWeight(BigDecimal("90"), 0.9, 0.1) === 10)
  }
}
