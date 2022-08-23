fun main() {
    println("Bem vindo ao Bytebank")

    val contaHygor = Conta()
    contaHygor.titular = "Hygor"
    contaHygor.numero = 1000
    contaHygor.setSaldo(1500.0)


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1002
    contaFran.setSaldo(2500.0)
    println()

    println("-----------------------------------------------")
    println("Titular da Conta --> ${contaHygor.titular}")
    println("Numero da Conta --> ${contaHygor.numero}")
    println("Saldo da conta Hygor --> ${contaHygor.getSaldo()}")
    println("-----------------------------------------------")


    println("Titular da Conta --> ${contaFran.titular}")
    println("Numero da Conta --> ${contaFran.numero}")
    println("Saldo da conta Fran --> ${contaFran.getSaldo()}")
    println("-----------------------------------------------")
    println()



//    DEPOSITOS
    println("depositando na conta do Hygor")
    contaHygor.deposita(valor = 100.0)
    println(contaHygor.getSaldo())
    println()

    println("------>>> depositando na conta da Fran")
    contaFran.deposita(valor = 200.0)
    println("Saldo ${contaFran.getSaldo()}")
    println()


//    SACANDO
    println("sacando da conta do Hygor")
    contaHygor.saca(100.0)
    println(contaHygor.getSaldo())

    println("----->>> sacando da conta do Fran")
    contaFran.saca(200.0)
    println("Saldo ${contaFran.getSaldo()}")

//    TRANSFERENCIA
    println("Transferencia da conta da Fran para Hygor")

    if (contaFran.transfere(1000.0, contaHygor)) {
        println("Transferencia sucedida")
    } else {
        println("Falaha na transferencia")
    }

    println()
    println("Conta Hygor ${contaHygor.getSaldo()}")
    println("Conta Fran ${contaFran.getSaldo()}")

}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

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
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        } else {
            println("DEU CERTO A FUN SET-SALDO")
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