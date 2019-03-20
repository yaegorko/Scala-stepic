package org.stepic.step4

import org.scalatest.FunSuite

class step431Test extends FunSuite{

  var result = BigInt.apply("354224848179261915075")
  assert(step431.fibs(100) === result)

}
