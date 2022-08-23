// Constructor Primary
class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

//    Constructor Secundary
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

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