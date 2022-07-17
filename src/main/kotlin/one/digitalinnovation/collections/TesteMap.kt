package one.digitalinnovation.collections

fun main(){
    val dupla: Pair<String, Double> = Pair("César", 2300.0)
    val map1 = mapOf(dupla)

    map1.forEach{ (key, value) -> println("Chave: $key - Valor: $value") }

    val map2 = mapOf("Luiz" to 2750.0, "Maria" to 3200.0)
    map2.forEach{ (key, value) -> println("Chave: $key - Valor: $value") }

}