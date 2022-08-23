public fun testaComportamentosConta() {


    val contaHygor = Conta(titular = "Hygor", numero = 1000)
    contaHygor.deposita(1500.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
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

    if (contaFran.transfere(valor = 1000.0, destino = contaHygor)) {
        println("Transferencia sucedida")
    } else {
        println("Falaha na transferencia")
    }

    println()
    println("Conta Hygor ${contaHygor.saldo}")
    println("Conta Fran ${contaFran.saldo}")

    println(testaCondicoes(contaHygor.saldo))
}