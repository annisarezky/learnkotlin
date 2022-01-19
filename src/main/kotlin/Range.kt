fun main() {

//    if (1 ,= 7 && <= 10){
        println("Value 7 avaible")
//    }

    val rangeInt = 1..10 step 2
//    println(rangeInt.toList())
//    println(rangeInt.step)

    rangeInt.forEach {
        println(it)
    }
     val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}