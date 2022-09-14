// package lab6
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._


// class task4t extends FreeSpec with ChiselScalatestTester {

//   "lab 6 task4" in {
//     test(new task4()){ dut =>
//         //dut.io.in.valid.poke(1.B)
//         dut.io.up_down.poke(0.B)
//         //dut.io.out.ready.poke(1.B)
//         // dut.io.raddr2.poke(3.U)
//         // dut.io.wen.poke(1.B)
//         // dut.io.waddr.poke(4.U)
//         // dut.io.wdata.poke(1112345.U)
//         dut.clock.step(50)
//         //dut.io.rdata1.ex
//         //pect(111234.U)
//         //dut.io.out.valid.expect(1.B)
//         //dut.io.out.expect(0.B)
//         //dut.io.out.bits.expect(4.U)
//         //dut.io.c.expect(39.U)
//         }
//     }
// }