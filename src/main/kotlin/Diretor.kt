class Diretor(

    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

//    fun bonificacao(): Double {
//        return salario * 0.3
//    }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            println("<<<<<  AUTENTICOU COM SUCESSO  >>>>>")
            return true
        }
        println("#####  FALHA NA AUTENTICACAO ####")
        return false

    }
}

