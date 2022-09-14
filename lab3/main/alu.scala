// package lab3
// import chisel3._
// object AlUOP {
//     val AlU_add = 0.U(4.W)
// }
// class alu extends Module {
//     val io = IO(new Bundle {
//         val in1 = Input(UInt(32.W))
//         val in2 = Input(UInt(32.W))
//         val out = Output(UInt(32.W))
//         val alu_op = Input(UInt(4.W))
//         val sum = Output(UInt(32.W))
//     })
//     io.sum := io.in1 + io.in2
//     io. out := Mux(io.alu_op === AlUOP.AlU_add,io.sum,0.U)  

// }