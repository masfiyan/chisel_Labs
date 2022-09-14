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
// //import ALUOP._
// class task1t extends FreeSpec with ChiselScalatestTester { 
//     "lab4 task 1" in {
//         test ( new task1 ) { dut =>
// // ALU operations
//             val array_op = Array ( aluop.beq ,aluop.bne,aluop.ab,aluop.bc , aluop.blt , aluop.bge , aluop.bltu , aluop.bgeu ) 
//             for ( i <- 0 until 100) {
//                 val src_a = Random . nextLong () & 0xFFFFFFFL
//                 val src_b = Random . nextLong () & 0xFFFFFFFL
//                 val num = Random . nextInt (8)
//                 val dc = array_op (4 )
//                 var result:Int = 1
//                 if (dc == aluop.beq) {
//                     if (src_a == src_b) {
//                         result = 1
//                     } else {
//                         result = 0
//                     }
//                 } else if ( dc == aluop.bne) {
//                     if (src_a != src_b) {
//                         result = 1
//                     } else {
//                         result = 0
//                     }
//                 } else if ( dc == aluop.ab) {
//                     result = 0
//                 } else if (dc == aluop.bc) {
//                     result = 0
//                 } else if ( dc == aluop.blt) {
//                     if (src_a < src_b) {
//                             result = 1
//                         } else {
//                             result = 0
//                         }
//                 } else if (dc == aluop.bge) {
//                      if (src_a > src_b) {
//                             result = 1
//                         } else {
//                             result = 0
//                         }
//                 } else if (dc == aluop.bltu) {
                
//                     if ( src_a < src_b) {
//                         result = 1
//                     } else {
//                         result = 0
//                     }
//                 } else if (dc == aluop .bgeu) {
//                     if (math.abs(src_a) > math.abs(src_b)) {
//                         result = 1
//                     } else {
//                         result = 0
//                     }
//                 } else {
//                     result = 0
//                 }
            
//                 dut.io.arg_x.poke(src_a.S)
//                 dut.io.arg_y.poke (src_b.S )
//                 dut.io.fnct3.poke ( 4.U )
//                 dut.io.branch.poke(1.B)
//                 dut.clock.step (1)
//                 dut.io.br_taken.expect(result.B)
//                 println(dut.io.arg_x.peek()litValue)
//                 println(dut.io.arg_y.peek()litValue)
//         }
//     }
// }
// }

