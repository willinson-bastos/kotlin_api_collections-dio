package one.digitalinnovation.collections

fun main(){
    val values = IntArray(size = 5)

    values[0] = 1
    values[1] = 5
    values[2] = 3
    values[3] = 9
    values[4] = 8

    for(x in values){
        println(x)
    }
    println("-------------")
    values.forEach {y->
        println(y)
    }

    println("-------------")
    values.sort()
    values.forEach {
        println(it)
    }
}