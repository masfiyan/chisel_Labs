package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class task1t extends FreeSpec with ChiselScalatestTester {
    "lab 2 task 1" in {
        test(new task1()){ dut =>
            dut.io.in(0).poke(12.U) //a
            dut.io.in(1).poke(15.U) //b
            dut.io.in(2).poke(16.U) //c
            dut.io.in(3).poke(17.U) //d
            dut.io.in(4).poke(18.U)
            dut.io.s0.poke(0.B)
            dut.io.s1.poke(1.B)
            dut.io.s2.poke(0.B)
            dut.clock.step(1)
            dut.io.out.expect(15.U)
        }
    }
}