package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(3,7,4,9,15,3,25)

    values.forEach {
        println(it)
    }
    println("-----------")
    values.sort()
    values.forEach {
        println(it)
    }
}