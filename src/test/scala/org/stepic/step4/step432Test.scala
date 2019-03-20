package org.stepic.step4

import org.scalatest.FunSuite

class step432Test extends FunSuite{

  assert(step432.middle("Scala") === 'a')
  assert(step432.middle(Seq(1, 7, 5, 9)) === 5)

}
