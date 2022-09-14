package lab6
import chisel3 . _
import chisel3 . util . _
class task4 ( val max : Int = 10) extends Module {
    val io = IO ( new Bundle {
        val out = Output ( UInt ( log2Ceil ( max ) . W ) )
        val up_down = Input ( Bool () )
})
    //val count = RegInit(1.U(log2Ceil(max).U))
    val counter = RegInit(0.U(8.W))
    when (counter === max.U) {
        counter := 0.U
    }.elsewhen(io.up_down === 1.B) {
        counter := counter + 1.U 
    }
    val a = RegInit(max.U(8.W))
    when (io.up_down =/= 1.B) {
        a := a-1.U
    }.elsewhen ( io.up_down===1.U) {
        a:=0.U
    }
    when ( io.up_down === 1.U ){
        io.out := counter
    }.otherwise {
        io.out := a
    }
}