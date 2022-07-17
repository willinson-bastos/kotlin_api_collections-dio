package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 4200.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2250.0, tipoContrato = "CLT")
    val clara = Funcionario(nome = "Clara", salario = 5250.0, tipoContrato = "PJ")

    val funcionarios1 = setOf<Funcionario>(joao, pedro)
    val funcionarios2 = setOf<Funcionario>(maria, clara)

    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach{ println(it) }

    println("--------------------------")
    val funcionarios3 = setOf<Funcionario>(joao, pedro, clara)
    val reducao = funcionarios3.subtract(funcionarios1)
    reducao.forEach{ println(it) }

    println("--------------------------")
    val comum = funcionarios3.intersect(funcionarios1)
    comum.forEach{ println(it) }

}