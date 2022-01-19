import kotlin.random.Random

fun main() {
    val value = 9
    val ranges = 10..50

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
//
//    when(value){
//        in ranges -> println("value is in the ranges")
//        !in ranges -> println("values is outside the range")
//        else -> println("value undefined")
//    }
}

fun getRegisterNumber() = Random.nextInt(100)