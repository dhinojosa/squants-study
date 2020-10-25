package com.xyzcorp.squants

import org.scalatest._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._
import squants.thermal._

class TemperaturesSpec extends AnyFunSpec with Matchers {
  describe("Squants supports temperatures") {
    it("can be created as Celsius and converted to Fahrenheit") {
      val freezing = Celsius(0)
      freezing.toFahrenheitScale should be(32.0)
    }
    it("can be created as Fahrenheit and converted to Celsius") {
      val boiling = Fahrenheit(212)
      boiling.toCelsiusScale should be(100.0)
    }
    it("""can be created then added using various scales, and operated on with
          |  mathematics of different scales""".stripMargin) {
      val freezing = Celsius(0)
      val result = freezing + Fahrenheit(12)
      result.toCelsiusDegrees should be(6.6 +- 0.1)
    }
    it("can start with Kelvin as well, we can also use a specialized toString") {
      val kelvin = Kelvin(40)
      kelvin.toString(Celsius) should be("-233.14999999999998°C")
    }
  }
}
