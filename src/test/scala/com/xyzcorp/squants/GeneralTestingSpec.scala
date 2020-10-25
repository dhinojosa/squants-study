package com.xyzcorp.squants

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import squants.space.{Meters, Volume}
import squants.thermal.Temperature
import squants.time.Seconds

class GeneralTestingSpec extends AnyFunSpec with Matchers {
  describe("Trying out squants") {
    it("should make a velocity which is cool") {
      val velocity = Meters(30) / Seconds(1)
      velocity
    }
    it("does money") {}
    it("does volumes") {
      import squants.space.VolumeConversions._

      val value1 = 5.cups
      val result: Volume = value1 + 12.fluidOunces
    }
    it("does temperatures") {
      import squants.thermal.Celsius

      val f: Temperature = Celsius(0)
      val r = f + Celsius(19)
      println(r.inCelsius)
    }
  }
}
