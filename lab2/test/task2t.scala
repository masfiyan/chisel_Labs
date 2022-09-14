package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class task2t extends FreeSpec with ChiselScalatestTester {
    "lab 2 task 2" in {
        test(new task2()){ dut =>
            dut.io.in(0).poke(0.B) //a
            dut.io.in(1).poke(0.B) //b
            dut.io.in(2).poke(0.B) //c
            dut.io.in(3).poke(1.B) //d
            dut.io.sel(0).poke(1.B)
            dut.io.sel(1).poke(1.B)
            dut.io.shift_type.poke(1.B)
            dut.clock.step(1)
            dut.io.out(0).expect(1.B)
            dut.io.out(1).expect(0.B)
            dut.io.out(2).expect(0.B)
            dut.io.out(3).expect(0.B)
        }
    }
}