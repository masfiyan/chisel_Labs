package lab2
import chisel3._
import chisel3.util._
class task2 extends Module {
    val io = IO ( new Bundle {
        val in = Vec (4 , Input ( Bool () ) )
        val sel = Vec (2 , Input ( Bool () ) )
        val shift_type = Input ( Bool () )
        val out = Vec(4,Output ( Bool () )) 
    })
    val a = Mux(io.sel(0),Mux(io.sel(1),io.in(3),io.in(1)),Mux(io.sel(1),io.in(2),io.in(0)))
    val b = Mux(io.sel(0),Mux(io.sel(1),Mux(io.shift_type,io.in(0),0.B),io.in(2)),Mux(io.sel(1),io.in(3),io.in(1)))
    val c = Mux(io.sel(0),Mux(io.sel(1),Mux(io.shift_type,io.in(1),0.B),io.in(3)),Mux(io.sel(1),Mux(io.shift_type,io.in(0),0.B),io.in(2)))
    val d = Mux(io.sel(0),Mux(io.sel(1),Mux(io.shift_type,io.in(2),0.B),Mux(io.shift_type,io.in(0),0.B)),Mux(io.sel(1),Mux(io.shift_type,io.in(1),0.B),io.in(3)))

    io.out(0) := a
    io.out(1) := b
    io.out(2) := c
    io.out(3) := d    
}