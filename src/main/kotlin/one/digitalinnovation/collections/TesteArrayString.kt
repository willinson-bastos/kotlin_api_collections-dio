package one.digitalinnovation.collections

fun main(){
    val nomes = Array(size = 3){""}

    nomes[0] = "Luiz"
    nomes[1] = "Fernando"
    nomes[2] = "Allan"

    for(posicao in nomes){
        println(posicao)
    }
    println("-------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Anna", "Carla")

    println("-------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}