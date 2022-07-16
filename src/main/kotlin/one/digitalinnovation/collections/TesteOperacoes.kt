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

    println("-------------------------")
    println(salarios.count { it in 2000.00 .. 5000.0 })

    println("-------------------------")
    println(salarios.find { it == 1250.0 })
    println(salarios.find { it == 1000.0 })

    println("-------------------------")
    println(salarios.any { it < 2000.0 })
    println(salarios.any { it < 1000.0 })
}