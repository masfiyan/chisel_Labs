// package lab4
// import chisel3._
// import chisel3.util._
// class labtask2i extends Bundle {
//     val instr = Input ( UInt (64. W ) )
//     val immd_se = Output ( UInt (32. W ) )
// }
// object Aluop{
//     val i = 19.U(7.W)
//     val s = 35.U(7.W)
//     val sb = 99.U(7.W)
//     val u = 55.U(7.W)
//     val uj = 111.U(7.W)
//     val ei = 0.U(32.W)
// }
// class labtask2 extends Module {
//     val io = IO ( new labtask2i)
//     io.immd_se := 
//     Mux(io.instr(6,0) === Aluop.i , Cat( Aluop.ei(19,0) , io.instr(31,20) ) ,
//     Mux(io.instr(6,0) === Aluop.s , Cat( Aluop.ei(19,0) , io.instr(32,25) , io.instr(11,7) ) ,
//     Mux(io.instr(6,0) === Aluop.sb , Cat( Aluop.ei(19,0) , io.instr(31) , io.instr(7) , io.instr(30,25) , io.instr(11,8) , Aluop.ei(0) ) ,
//     Mux(io.instr(6,0) === Aluop.u , Cat( io.instr(31,12) , Aluop.ei(11,0) ) ,
//     Mux(io.instr(6,0) === Aluop.uj , Cat( io.instr(31) , io.instr(19,12) , io.instr(20) , io.instr(31,21) , Aluop.ei(11,0) ) ,
//     0.U)))))

// }