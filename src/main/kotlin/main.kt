fun main() {
    println("Bem vindo ao Bytebank")


    val contaHygor = Conta()
    contaHygor.titular = "Hygor"
    contaHygor.numero = 1000
    contaHygor.saldo = 100.0


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 300.0


    println(contaHygor.titular)
    println(contaHygor.numero)
    println(contaHygor.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println("depositando na conta do Hygor")
    contaHygor.deposita(valor = 50.0)
    println(contaHygor.saldo)
    println()

    println("sacando da conta do Hygor")
    contaHygor.saca(130.0)
    println(contaHygor.saldo)


    println("------>>> depositando na conta da Fran")
    contaFran.deposita(valor = 70.0)
    println("Saldo ${contaFran.saldo}")
    println()

    println("----->>> sacando da conta do Fran")
    contaFran.saca(130.0)
    println("Saldo ${contaFran.saldo}")



}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(saldo >= valor){
            saldo -= valor
            println("Valor sacado $valor")
        } else {
            println("Saldo insuficiente")
        }
    }
}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero X $numeroX")
    println("numero Y $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "Joao"

    var contaMaria = Conta()
    contaMaria.titular = "Maria"


    println("titular conta joao   -> ${contaJoao.titular}")
    println("titular conta maria -> ${contaMaria.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Hygor $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i



        println("Titular -->$titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }


//    for (i in 5 downTo 1) {
//        val titular: String = "Hygor $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = 10.0 + i
//
//
//
//        println("Titular -->$titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()

//    testaCondicoes(saldo)
}


fun testaCondicoes(saldo: Double) {
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