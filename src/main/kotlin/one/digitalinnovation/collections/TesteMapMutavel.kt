package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 4200.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2250.0, tipoContrato = "CLT")
    val clara = Funcionario(nome = "Clara", salario = 5250.0, tipoContrato = "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)
    repositorio.create(clara.nome, clara)

    println(repositorio.findById(pedro.nome))

    println("--------------------------")
    repositorio.findAll().forEach { println(it) }

    println("--------------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}