package lab3
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class task3t extends FreeSpec with ChiselScalatestTester {

  "lab 3 immediate practice " in {
    test(new task2()) { dut =>
        dut.io.instr.poke("h00112223".U)
        dut.clock.step(1)
        dut.io.immd_se.expect("b00000000000000000000000000000100".U)

        }
    }
}