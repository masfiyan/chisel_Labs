package lab8
import chisel3._
import chisel3.util._
class task1 extends Module {
    val io = IO (new Bundle {
        val memory_Out = Vec (4 , Output ( UInt (32. W ) ) )
        val requestor = Vec (4 , Flipped ( Decoupled ( UInt (32. W ) ) ) )
        val Readaddr = Input ( UInt (5. W ) )
        val Writeaddr = Input ( UInt (5. W ) )
        })

    val Q1 = Queue(io.requestor(0))
    val Q2 = Queue(io.requestor(1))
    val Q3 = Queue(io.requestor(2))
    val Q4 = Queue(io.requestor(3))
    val arbiter = Module (new Arbiter ( UInt () , 4) )
    arbiter.io.in (0) <> Q1
    arbiter.io.in (1) <> Q2
    arbiter.io.in (2) <> Q3
    arbiter.io.in (3) <> Q4
    arbiter.io.out.ready := 1.B
    val memory = Mem(1024,Vec(4,UInt(32.W)))
    val data = Reg(Vec(4, UInt()))
    when( io.requestor(0).valid ){
        data(0) := arbiter.io.out.bits
        data(1) := 0.U
        data(2) := 0.U
        data(3) := 0.U
        memory.write(io.Writeaddr, data)
    }.elsewhen( io.requestor(1).valid){
        data(0) := 0.U
        data(1) := arbiter.io.out.bits
        data(2) := 0.U
        data(3) := 0.U
        memory.write(io.Writeaddr, data)
    }.elsewhen( io.requestor(2).valid){
        data(0) := 0.U
        data(1) := 0.U
        data(2) := arbiter.io.out.bits
        data(3) := 0.U
        memory.write(io.Writeaddr, data)
    }.elsewhen( io.requestor(2).valid){
        data(0) := 0.U
        data(1) := 0.U
        data(2) := 0.U
        data(3) :=arbiter.io.out.bits
        memory.write(io.Writeaddr, data)
    }
    io.memory_Out := memory.read(io.Readaddr)
}