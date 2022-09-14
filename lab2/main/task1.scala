package lab2
import chisel3._
import chisel3.util._
class task1 extends Module {
    val io = IO(new Bundle {
        val in = Vec(5, Input(UInt(32.W)))
        val s0 = Input(Bool())
        val s1 = Input(Bool())
        val s2 = Input(Bool())
        val out = Output(UInt(32.W))
    })
    io.out := Mux((io.s2),io.in(4),Mux(io.s0,Mux(io.s1,io.in(3),io.in(1)),Mux(io.s1,io.in(2),io.in(0))))
}