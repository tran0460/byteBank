public fun testeFuncionarios() {
    val alex = Funcionario(
        nome = "Alex",
        cpf = "121.325.325-98",
        salario = 1000.0,
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.232.323.-96",
        salario = 2500.0,
        senha = 1234
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "525.326.326-52",
        salario = 4000.0,
        senha = 1235,
        plr = 1500.0
    )



    println("Nome--> ${alex.nome}")
    println("CPF--> ${alex.cpf}")
    println("Salario--> ${alex.salario}")
    println("Bonificacao Alex--> ${alex.bonificacao}")
    println()

    println("Nome--> ${fran.nome}")
    println("CPF--> ${fran.cpf}")
    println("Salario--> ${fran.salario}")
    println("Bonificacao Fran--> ${fran.bonificacao}")
    fran.autenticacao(senha = 1234)
    println()

    println("Nome--> ${gui.nome}")
    println("CPF--> ${gui.cpf}")
    println("Salario--> ${gui.salario}")
    println("Bonificacao Gui--> ${gui.bonificacao}")
    println("Plr ${gui.plr}")
    gui.autenticacao(senha = 1235)
}