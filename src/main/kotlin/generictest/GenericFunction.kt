package generictest

//fun <T> run(): T {
//    /*...*/
//}

fun main() {
    val numbers = (1..100).toList()
    numbers.slice<Int>(1..10)
}