// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._


// class practicet extends FreeSpec with ChiselScalatestTester {

//   "practice concatenate" in {
//     test(new practice()) { dut =>
//         dut.io.in.poke(5.U)
//         //dut.io.in.valid.poke(1.B)
//         dut.clock.step(1)
//         //dut.io.out.valid.expect(true.B)
//         dut.io.out.bits.expect(5.U)
//         //dut.io.c.expect(39.U)
//         }
//     }
// }