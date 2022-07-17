package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 4200.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2250.0, tipoContrato = "CLT")

    val funcionarios = listOf<Funcionario>(joao, pedro, maria)
    funcionarios.forEach{ println(it) }

    println("-----------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-----------------------")
    funcionarios.sortedBy { it.salario }.forEach{ println(it) }

    println("-----------------------")
    funcionarios.groupBy { it.tipoContrato }.forEach{ println(it) }



}

data class Funcionario(val nome: String, val salario: Double, val tipoContrato: String) {
    override fun toString(): String {
        return "" +
                "Nome:     $nome\n" +
                "Salário:  $salario\n" +
                "Contrato: $tipoContrato" +
                "".trimIndent()
    }
}