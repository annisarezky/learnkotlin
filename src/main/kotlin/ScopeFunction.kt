fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
    val text = "Hello"
    val result = text.run {
        val from = this
        val length = this.length
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to length is $length"
    }
    println("result : $result")

    hello()
}


fun hello() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
        "this is $this"
    }
    print(result)
}

