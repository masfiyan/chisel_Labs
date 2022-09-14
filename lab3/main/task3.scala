package lab3
import chisel3 . _
import chisel3 . util . _
class task3i extends Bundle {
    val in = Input ( UInt (2. W ) )
    val out = Valid ( Output ( UInt (4. W ) ) )
}
class task3 extends Module {
    val io = IO ( new task3i)
    val out0 = Mux( io.in === 0.U , 1.B , 0.B )
    val out1 = Mux( io.in === 1.U , 1.B , 0.B )
    val out2 = Mux( io.in === 2.U , 1.B , 0.B )
    val out3 = Mux( io.in === 3.U , 1.B , 0.B )
    val cot = Cat(out3,out2,out1,out0)
    io.out.bits := cot
    io.out.valid := 1.B
}
