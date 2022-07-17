package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 1250.0)
    val pedro = Funcionario(nome = "Pedro", salario = 4200.0)
    val maria = Funcionario(nome = "Maria", salario = 3500.0)

    val funcionarios = listOf<Funcionario>(joao, pedro, maria)
    funcionarios.forEach{ println(it) }

    println("-----------------------")
    println(funcionarios.find { it.nome == "Maria" })

}

data class Funcionario(val nome: String, val salario: Double) {
    override fun toString(): String {
       return "" +
                "Nome:    $nome\n" +
                "Salário: $salario" +
                "".trimIndent()
    }
}