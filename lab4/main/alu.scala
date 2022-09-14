// package lab4

// import chisel3._ 
// import chisel3.util._ 


// object ALUOP {
//     val ALU_ADD = 0.U(4.W)
//     val ALU_SUB = 1.U(4.W)
//     val ALU_AND = 2.U(4.W)
//     val ALU_OR  = 3.U(4.W)
//     val ALU_XOR = 4.U(4.W)
//     val ALU_SLT = 5.U(4.W)
//     val ALU_SLL = 6.U(4.W)
//     val ALU_SLTU= 7.U(4.W)
//     val ALU_SRL = 8.U(4.W)
//     val ALU_SRA = 9.U(4.W)
//     val ALU_COPY_A = 10.U(4.W)
//     val ALU_COPY_B = 11.U(4.W)
//     val ALU_XXX = 12.U(4.W) 
// }

// trait Config{
//     val WLEN = 32
//     val ALUOP_SIG_LEN = 4
// }
// import ALUOP._

// class alui extends Bundle with Config {
//     val in_A = Input( SInt(WLEN.W))
//     val in_B = Input(SInt(WLEN.W))
//     val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
//     val out = Output(UInt(WLEN.W))
//     val sum = Output(UInt(WLEN.W))
// }

// class alu extends Module with Config {
//     val io = IO(new alui)

//     io.sum := io.in_A + Mux(io.alu_Op(0) === 0.U, io.in_B, -io.in_B)
//     val cmp = Mux(io.in_A(WLEN-1) === io.in_B(WLEN-1), io.sum(WLEN-1),
//                  Mux(io.alu_Op(1), io.in_A(WLEN-1), io.in_B(WLEN-1)))
//     // val shamt = io.in_A(4,0).asUInt
//     // val a = Mux ( io . alu_Op (3) , io . in_A , Reverse ( io . in_A ) )
//     // val shiftr = (Cat(io.alu_Op(0) , a, a(WLEN-1)).asSInt >> shamt)(WLEN-1,0)
//     // val shitfl = Reverse(shiftr)
//     io.out := 
//     Mux(io.alu_Op === ALU_ADD || io.alu_Op === ALU_SUB, io.sum, 
//     Mux(io.alu_Op === ALU_SLT , cmp,
//     Mux(io.alu_Op === ALU_SLTU,io.in_A < io.in_B , 
//     Mux(io.alu_Op === ALU_SRA  ,0.U ,
//     Mux(io.alu_Op === ALU_SRL , 0.U, 
//     Mux(io.alu_Op === ALU_SLL, 0.U, 
//     Mux(io.alu_Op === ALU_AND, (io.in_A & io.in_B),
//     Mux(io.alu_Op === ALU_OR, (io.in_A | io.in_B),
//     Mux(io.alu_Op === ALU_XOR, (io.in_A ^ io.in_B),
//     Mux(io.alu_Op === ALU_COPY_A, io.in_A, 
//     Mux(io.alu_Op === ALU_COPY_B, io.in_A, 0.U)))))))))))


// }