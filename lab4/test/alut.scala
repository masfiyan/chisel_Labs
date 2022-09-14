// package lab4
// import chisel3._
// import chisel3.util._
// import org.scalatest.FreeSpec
// import chisel3.tester._
// import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
// import scala.util.Random
// import chisel3.experimental.BundleLiterals._
// import ALUOP._
// class alut extends FreeSpec with ChiselScalatestTester { 
//     "ALU Test" in {
//         test (new alu) { dut =>
//         val src_a = Random . nextLong () & 0xFL
//         val src_b = Random . nextLong () & 0xFL
//         val opr = Random . nextInt (1)
//         val a = src_a + src_b
//         dut.io.in_A.poke(src_a.U)
//         dut.io.in_B.poke ( src_b . U )
//         dut.io.alu_Op.poke (0.U)
//         dut.clock.step (1)
//         dut.io.out.expect (a.asUInt)
//         }
//     }
// }