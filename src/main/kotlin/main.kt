fun main() {
    println("Bem vindo ao Bytebank")

    val contaHygor = Conta("Hygor", 1000)
    contaHygor.deposita(1500.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(2500.0)
    println()


    println("-----------------------------------------------")
    println("Titular da Conta --> ${contaHygor.titular}")
    println("Numero da Conta --> ${contaHygor.numero}")
    println("Saldo da conta Hygor --> ${contaHygor.saldo}")
    println("-----------------------------------------------")


    println("Titular da Conta --> ${contaFran.titular}")
    println("Numero da Conta --> ${contaFran.numero}")
    println("Saldo da conta Fran --> ${contaFran.saldo}")
    println("-----------------------------------------------")
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
        private set

    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else {
            println("O valor precisa ser maior que 0.0")
        }
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


//    Nao é usual este tipo de codigo
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo = valor
//
//    }
}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero X $numeroX")
    println("numero Y $numeroY")

    val contaJoao = Conta("Joao", 1002)

    var contaMaria = Conta("Maria", 1003)

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