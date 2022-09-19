package lab7
import chisel3 . _
import chisel3 . util . _
class task1 extends Module {
    val io = IO(new Bundle {
        val f1 = Input(Bool())
        val f2 = Input(Bool())
        val r1 = Input(Bool())
        val r2 = Input(Bool())
        var out = Output(UInt(10.W))
    })
    val s0 = 0.U
    val s1 = 1.U
    val s2 = 2.U
    val s3 = 3.U
    val s4 = 4.U
    val s5 = 5.U
    // val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil = Enum(5)
    val state = RegInit(s0)
    io.out := 0.U
    when (state === s0) {
            when (io.f1 === 0.B & io.f2 === 0.B) {
                io.out := 0.U
                state := s0
            }.elsewhen (io.f1 === 1.B & io.f2 === 0.B) {
                io.out := 0.U
                state := s1
            }.elsewhen (io.f1 === 0.B & io.f2 === 1.B) {
                io.out := 0.U
                state := s5
            }.elsewhen ( io.f1 === 1.B & io.f2 === 1.B) {
                io.out := 0.U
                state := s1
            }.otherwise {
                io.out := 0.U
            }
        }   
         when (state === s1) {
             when (io.f1 === 0.B & io.r1 === 0.B) {
                 io.out := 0.U
                 state := s1
             }.elsewhen ( io.f1 === 1.B) {
                 io.out := 0.U
                 state := s2
             }.elsewhen (io.f1 === 0.B & io.r1 === 1.B) {
                 io.out := 0.U
                 state := s0
             }.otherwise {
                 io.out := 0.U
             }
         }
         when (state === s2) {
             when (io.f1 === 0.B & io.f2 === 0.B ) {
                 io.out := 3.U
                 state := s2
             }.elsewhen ( io.f1 === 1.B ) {
                 io.out := 3.U
                 state := s3
             }.elsewhen (io.f1 === 0.B & io.r1 === 1.B) {
                 io.out := 3.U
                 state := s1
             }.otherwise {
                 io.out := 0.U
             }
         }
         when (state === s3) {
             io.out := 0.U
             state := s0
         }
         when (state === s4) {
             when (io.f2 === 1.B) {
                 io.out := 7.U
                 state := s3
             }.elsewhen (io.f2 === 0.B & io.r2 === 0.B) {
                 io.out := 7.U
                 state := s4
             }.elsewhen (io.f2 === 0.B & io.r2 === 1.B) {
                 io.out := 7.U
                 state := s5
             }.otherwise {
                 io.out := 0.U
             }
         }
         when (state === s5) {
             when (io.f2 === 1.U) {
                 io.out := 0.U
                 state := s4
             }.elsewhen (io.f2 === 0.B & io.r2 === 0.B) {
                 io.out := 0.U
                 state := s5
             }.elsewhen (io.f2 === 0.B & io. r2 === 1.B) { 
                 io.out := 0.U
                 state := s0
             }.otherwise {
                 io.out := 0.U
             }
         }
}


     
            

        
    