package lab8
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._


class task1t extends FreeSpec with ChiselScalatestTester {

  "lab8 task1" in {
    test(new task1()){ dut =>
        dut.clock.step(10)
        dut.io.requestor(0).bits.poke(20.U)
        dut.io.requestor(1).bits.poke(30.U)
        dut.io.requestor(2).bits.poke(40.U)
        dut.io.requestor(3).bits.poke(50.U)
        dut.io.requestor(0).valid.poke(0.B)
        dut.io.requestor(1).valid.poke(0.B)
        dut.io.requestor(2).valid.poke(1.B)
        dut.io.requestor(3).valid.poke(0.B)
        dut.io.Readaddr.poke(17.U)
        dut.io.Writeaddr.poke(17.U)
        dut.clock.step(50)
        }
    }
}