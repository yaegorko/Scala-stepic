package org.stepic.step5

import java.io.ByteArrayInputStream

import org.scalatest.FunSuite

class step511Test extends FunSuite {
  var in = new ByteArrayInputStream("4".getBytes)
  val result = new java.io.ByteArrayOutputStream()
  Console.withIn(in) {
    assert(step511.mutuallySimple() === Console.withOut(result) {
      print("1 1\n1 2\n1 3\n2 1\n2 3\n3 1\n3 2")
    })
  }
}
