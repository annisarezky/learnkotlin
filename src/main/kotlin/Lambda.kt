fun main() {

    val length = messageLength("Hello From lambda")
    println("Message length $length")
    message()
    printlnMessage("Hello From Lambda")
}

val message = { println("Hello From Lambda") }
val printlnMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

fun messageLength(message: String) {

}