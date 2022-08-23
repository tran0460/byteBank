fun main() {
    println("Bem vindo ao Bytebank")

    val contaHygor = Conta()
    contaHygor.titular = "Hygor"
    contaHygor.numero = 1000
    contaHygor.saldo = 1000.0


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.saldo = 2000.0

    println("Titular da Conta ${contaHygor.titular}")
    println(contaHygor.numero)
    println(contaHygor.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

//    DEPOSITOS
    println("depositando na conta do Hygor")
    contaHygor.deposita(valor = 100.0)
    println(contaHygor.saldo)
    println()

    println("------>>> depositando na conta da Fran")
    contaFran.deposita(valor = 200.0)
    println("Saldo ${contaFran.saldo}")
    println()


//    SACANDO
    println("sacando da conta do Hygor")
    contaHygor.saca(100.0)
    println(contaHygor.saldo)

    println("----->>> sacando da conta do Fran")
    contaFran.saca(200.0)
    println("Saldo ${contaFran.saldo}")

//    TRANSFERENCIA
    println("Transferencia da conta da Fran para Hygor")

    if (contaFran.transfere(1000.0, contaHygor)) {
        println("Transferencia sucedida")
    } else {
        println("Falaha na transferencia")
    }

    println()
    println("Conta Hygor ${contaHygor.saldo}")
    println("Conta Fran ${contaFran.saldo}")

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            println("Valor sacado $valor")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
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