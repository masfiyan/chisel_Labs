// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class alut extends FreeSpec with ChiselScalatestTester {

//   "lab 3 alu practice " in {
//     test(new alu()) { dut =>
//         dut.io.in1.poke(15.U)
//         dut.io.in2.poke(10.U)
//         dut.io.alu_op.poke(0.U)
//         dut.clock.step(1)
//         dut.io.out.expect(25.U)
//         }
//     }
// }