package one.digitalinnovation.collections

data class Funcionario(val nome: String, val salario: Double, val tipoContrato: String) {
    override fun toString(): String {
        return "" +
                "Nome:     $nome\n" +
                "Salário:  $salario\n" +
                "Contrato: $tipoContrato" +
                "".trimIndent()
    }
}
