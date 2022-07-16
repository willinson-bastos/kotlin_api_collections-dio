package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.00
    salarios[1] = 1500.00
    salarios[2] = 2000.00

    salarios.forEach { println(it) }
    println("----------------------")

    salarios.forEachIndexed  { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }
    println("----------------------")

    val salarios2 = doubleArrayOf(6000.0, 1000.0, 3000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}