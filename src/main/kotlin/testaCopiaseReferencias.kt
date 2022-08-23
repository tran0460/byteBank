fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero X $numeroX")
    println("numero Y $numeroY")

    val contaJoao = Conta("Joao", 1002)
    contaJoao.titular = "Joao"

    var contaMaria = Conta("Maria", 1003)

    println("titular conta joao   -> ${contaJoao.titular}")
    println("titular conta maria -> ${contaMaria.titular}")
}