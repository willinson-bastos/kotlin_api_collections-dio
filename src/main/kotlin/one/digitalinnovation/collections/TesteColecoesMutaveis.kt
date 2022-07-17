package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 4200.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2250.0, tipoContrato = "CLT")
    val clara = Funcionario(nome = "Clara", salario = 5250.0, tipoContrato = "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    println("------------------------------")
    funcionarios.add(clara)
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("------------------------------")
    funcionarios.remove(maria)
    funcionarios.sortedBy { it.nome }.forEach { println(it) }

    println("-------------SET--------------")
    val funcionariosSet = mutableSetOf(pedro)
    funcionariosSet.forEach { println(it) }

    println("------------------------------")
    funcionariosSet.add(maria)
    funcionariosSet.add(clara)
    funcionariosSet.forEach { println(it) }

    println("------------------------------")
    funcionariosSet.remove(clara)
    funcionariosSet.forEach { println(it) }

}