// package lab4
// import chisel3._
// import chisel3.util._
// import org.scalatest.FreeSpec
// import chisel3.tester._
// import chiseltest.experimental.TestOptionBuilder._
// import chiseltest.internal.VerilatorBackendAnnotation
// import scala.util.Random
// import chisel3.experimental.BundleLiterals._
// import scala.math._
// import Aluop._
// class task2t extends FreeSpec with ChiselScalatestTester { 
//     "lab4 task 2" in {
//         test ( new labtask2() ) { dut =>
// // ALU operations
//             val array_op = Array ( i , s ,sb ,u , ei )
//             val values = Array("h7E600113".toInt)//,"h3FD00193","hFFB00213","hE7000293","h0C21A423","h0621A223","h1221A623","h00833137","h0044B1B7","h00310263","h00311263","h00314263") 
//             //for ( i <- 0 until 13 ) { 
//                 val a = values(0) & 0x3F
//                 if (a == array_op(0)) {
//                     val b = (values(0) >> 19) & 0xFFFL
//                     val c = array_op(4) & 0xFFFFFL
//                     val result = c.concat(b)
//                 } 
//                 dut.io.instr.poke(values(0).U)
//                 dut.clock.step (1)
//                 dut.io.immd_se.expect(result.U)
//                 //println(dut.io.instr.peek()litValue)
//                 //println(dut.io.immd_se.peek()litValue)
//         }
//     }
// }


