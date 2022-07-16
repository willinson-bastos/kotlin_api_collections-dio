package one.digitalinnovation.collections


fun main(){
    val salarios = doubleArrayOf(1250.0, 3500.0, 2340.0)


    for(salario in salarios){
        println(salario)
    }
    salarios.sort()
    println("-------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salarioMaiorQue2Mil = salarios.filter { it > 2000.0 }
    println("-------------------------")
    salarioMaiorQue2Mil.forEach(){ println(it) }
}