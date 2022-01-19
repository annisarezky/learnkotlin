package exception

fun main() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}