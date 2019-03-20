package org.stepic.step3

import java.io.ByteArrayInputStream

import org.scalatest.FunSuite

class step342Test extends FunSuite {

  var in = new ByteArrayInputStream("abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === true)
  }

  in = new ByteArrayInputStream("abc_abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === true)
  }

  in = new ByteArrayInputStream("_abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("abc_".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("Abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("_abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("abc__abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("abc_Abc".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("123".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }

  in = new ByteArrayInputStream("._".getBytes)
  Console.withIn(in) {
    assert(step342.checkExpression() === false)
  }
}
