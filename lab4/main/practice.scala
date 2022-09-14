// package lab4
// import chisel3._
// import chisel3.util._
// //import chisel3 . iotesters .{ Driver , PeekPokeTester }
// class practice extends Module {
//     val io = IO(new Bundle {
//         val in = Input(UInt(16.W))
//         val out = Output(UInt(16.W))
//     })
//     io.out := log2Ceil(io.in)
// }