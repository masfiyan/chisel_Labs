package  lab1
import chisel3._
class task2 (n:UInt) extends Module {
    val io = IO(new Bundle {
        val counter = Output(UInt(8.W))
    })
    val count = RegInit(0.U(8.W))
    val a = RegInit(0.U(8.W))
    when (count < n && a === 0.U) {
            count := count + 1.U
    }.elsewhen ( count === n ) {
        count := count - 1.U
        a := a + 1.U
    }.elsewhen (a =/= 0.U) {
        count := count - 1.U
    }
    
    io.counter := count
}