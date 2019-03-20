package org.stepic.step3

import org.scalatest.FunSuite

class step331Test extends FunSuite {
  var result: Boolean = step331.isCapital("Scala", 0)
  assert(result === true)
  result = step331.isCapital("Scala", 1)
  assert(result === false)
  result = step331.isCapital("ScAla", 2)
  assert(result === true)
}
