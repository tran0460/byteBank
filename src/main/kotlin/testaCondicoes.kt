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