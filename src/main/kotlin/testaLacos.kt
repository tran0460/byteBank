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