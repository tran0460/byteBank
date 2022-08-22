fun main(){
println("Bem vindo ao Bytebank")
    val titular: String = "Hygor"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += + 350
    saldo -= 1000


    println("Titular -->$titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")

//    two ways to write tha same if/else
    //    if (saldo > 0.0){
//        println("conta é positiva")
//    } else if (saldo == 0.0) {
//        println("conta é neutra")
//    } else {
//        println("Conta negativa")
//    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("Conta negativa")
    }


}