package org.stepic.step4

import org.scalatest.FunSuite

class step411Test extends FunSuite{
  assert(step411.fibs(3) === 2)
  assert(step411.fibs(4) === 3)
  assert(step411.fibs(5) === 5)
  assert(step411.fibs(10) === 55)
}
