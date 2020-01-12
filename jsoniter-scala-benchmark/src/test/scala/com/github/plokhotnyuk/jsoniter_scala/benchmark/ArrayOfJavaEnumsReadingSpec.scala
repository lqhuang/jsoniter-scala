package com.github.plokhotnyuk.jsoniter_scala.benchmark

class ArrayOfJavaEnumsReadingSpec extends BenchmarkSpecBase {
  private val benchmark = new ArrayOfJavaEnumsReading {
    setup()
  }
  
  "ArrayOfJavaEnumsReading" should {
    "read properly" in {
      benchmark.avSystemGenCodec() shouldBe benchmark.obj
      benchmark.borerJson() shouldBe benchmark.obj
      benchmark.circe() shouldBe benchmark.obj
      //FIXME: DSL-JSON throws java.lang.ArrayIndexOutOfBoundsException: 0
      //benchmark.dslJsonScala() shouldBe benchmark.obj
      benchmark.jacksonScala() shouldBe benchmark.obj
      benchmark.jsoniterJava() shouldBe benchmark.obj
      benchmark.jsoniterScala() shouldBe benchmark.obj
      benchmark.playJson() shouldBe benchmark.obj
      benchmark.sprayJson() shouldBe benchmark.obj
      benchmark.uPickle() shouldBe benchmark.obj
    }
  }
}