package lab7
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class task1t extends FreeSpec with ChiselScalatestTester {

  "lab 7 task1" in {
    test(new task1()){ dut =>
        dut.io.f1.poke(1.B)
        dut.io.f2.poke(0.B)
        //dut.io.r1.poke(1.B)
        //dut.io.r2.poke(1.B)
        dut.clock.step(10)
        dut.io.out.expect(0.U)
        }
    }
}