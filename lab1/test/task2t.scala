package lab1
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class task2t extends FreeSpec with ChiselScalatestTester {

  "lab 1 task 2" in {
    test(new task2(10.U)) { dut =>
      dut.clock.step(20)
      }
    }
}