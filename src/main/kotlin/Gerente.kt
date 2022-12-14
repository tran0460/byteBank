class Gerente(

    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            println("<<<<<  AUTENTICOU COM SUCESSO  >>>>>")
            return true
        }
        println("#####  FALHA NA AUTENTICACAO ####")
        return false

    }
}

