// package lab3
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._


// class task3t extends FreeSpec with ChiselScalatestTester {

//   "lab 3 task 3" in {
//     test(new task3()) { dut =>
//         dut.io.in.poke(2.U)
//         //dut.io.in.valid.poke(1.B)
//         dut.clock.step(1)
//         dut.io.out.valid.expect(true.B)
//         dut.io.out.bits.expect(4.U)
//         //dut.io.c.expect(39.U)
//         }
//     }
// }