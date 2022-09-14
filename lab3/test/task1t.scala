// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class task1t extends FreeSpec with ChiselScalatestTester {

//   "lab 3 task 1" in {
//     test(new task1()) { dut =>
//         dut.io.fnct3.poke(6.U)
//         dut.io.branch.poke(1.B)
//         dut.io.arg_x.poke(8.S)
//         dut.io.arg_y.poke(-10.S)
//         dut.clock.step(1)
//         dut.io.br_taken.expect(1.B)
//         }
//     }
// }