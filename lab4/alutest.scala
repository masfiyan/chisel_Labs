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
// class alutest extends FreeSpec with ChiselScalatestTester { 
//     "ALU Test" in {
//         test ( new alu ) { dut =>
// // ALU operations
//         val array_op = Array ( ALU_ADD , ALU_SUB , ALU_AND , ALU_OR , ALU_XOR , ALU_SLT ,ALU_SLL , ALU_SLTU , ALU_SRL , ALU_SRA , ALU_COPY_A , ALU_COPY_B )
//         //for ( i <- 0 until 100) {
//         val src_a = Random . nextLong () & 0xFFFFFFL
//         val src_b = Random . nextLong () & 0xFFFFFFL
//         val opr = Random . nextInt (1)
//         val aluop = array_op ( 5 )
//         val result = aluop match {
//             case ALU_ADD => src_a + src_b
//             case ALU_SUB => src_a - src_b
//             case ALU_AND => src_a & src_b
//             case ALU_OR => src_a | src_b
//             case ALU_XOR => src_a ^ src_b
//             case ALU_SLT => ( src_a.toInt < src_b.toInt ).asInstanceOf[ Int ]
//             case ALU_SLL => 0
//             case ALU_SLTU => ( src_a < src_b ) . asInstanceOf [ Int ]
//             case ALU_SRL => 0
//             case ALU_SRA => 0
//             case ALU_COPY_A => src_a
//             case ALU_COPY_B => src_b
//             case _ => 0
//         }
//         //val result1 : BigInt = if ( result < 0)
//           //                  ( BigInt (0xFFFFFFFFL ) + result +1) & 0xFFFFFFFFL
//             //                else result & 0xFFFFFFFFL
//         dut.io.in_A.poke(src_a.S)
//         dut.io.in_B.poke ( src_b . S )
//         dut.io.alu_Op.poke ( 5.U )
//         dut.clock.step (1)
//         dut.io.out.expect (result.asUInt)
//         println(dut.io.in_A.peek().litValue)
//         println(dut.io.in_B.peek().litValue)
//         }
//         //c.clock.step(2)
//     }
// }
