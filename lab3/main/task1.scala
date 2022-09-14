// package lab3
// import chisel3._
// object AlUOP {
//     val beq = 0.U(3.W)
//     val bne = 1.U(3.W)
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
//     val br_taken = Output ( Bool () ) 
// }
// class task1 extends Module { 
//     val io = IO ( new task1b)
//     io.br_taken := 
//     Mux(io.fnct3 === AlUOP.beq,Mux(io.arg_x === io.arg_y && io.branch === 1.B,1.B,0.B),
//     Mux(io.fnct3 === AlUOP.bne,Mux(io.arg_x =/= io.arg_y && io.branch === 1.B,1.B,0.B),
//     Mux(io.fnct3 === AlUOP.blt,Mux(io.arg_x < io.arg_y && io.branch === 1.B,1.B,0.B),
//     Mux(io.fnct3 === AlUOP.bge,Mux(io.arg_x > io.arg_y && io.branch ===1.B,1.B,0.B),
//     Mux(io.fnct3 === AlUOP.bltu,Mux(io.arg_x.asUInt < io.arg_y.asUInt && io.branch === 1.B,1.B,0.B),
//     Mux(io.fnct3 === AlUOP.bgeu,Mux(io.arg_x.asUInt > io.arg_y.asUInt && io.branch === 1.B,1.B,0.B),0.B))))))

// }