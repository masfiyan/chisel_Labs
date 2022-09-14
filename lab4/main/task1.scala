// package lab4
// import chisel3._
// object aluop {
//     val beq = 0.U(3.W)
//     val bne = 1.U(3.W)
//     val ab = 2.U(3.W)
//     val bc = 3.U(3.W)
//     val blt = 4.U(3.W)
//     val bge = 5.U(3.W)
//     val bltu = 6.U(3.W)
//     val bgeu = 7.U(3.W)
// }
// class task1b extends Bundle {
//     val fnct3 = Input ( UInt (3. W ) )
//     val branch = Input ( Bool () )
//     val arg_x = Input ( SInt (32. W ) )
//     val arg_y = Input ( SInt (32. W ) )
//     val br_taken = Output ( Bool() ) 
// }
// class task1 extends Module { 
//     val io = IO ( new task1b)
//     io.br_taken := 
//     Mux(io.fnct3 === aluop.beq,Mux(io.arg_x === io.arg_y && io.branch === 1.B,1.B,0.U),
//     Mux(io.fnct3 === aluop.bne,Mux(io.arg_x =/= io.arg_y && io.branch === 1.B,1.B,0.U),
//     Mux(io.fnct3 === aluop.blt,Mux(io.arg_x < io.arg_y && io.branch === 1.B,1.B,0.U),
//     Mux(io.fnct3 === aluop.bge,Mux(io.arg_x > io.arg_y && io.branch ===1.B,1.B,0.U),
//     Mux(io.fnct3 === aluop.bltu,Mux(io.arg_x.asUInt < io.arg_y.asUInt && io.branch === 1.B,1.B,0.U),
//     Mux(io.fnct3 === aluop.bgeu,Mux(io.arg_x.asUInt > io.arg_y.asUInt && io.branch === 1.B,1.B,0.U),0.U))))))
    

// }