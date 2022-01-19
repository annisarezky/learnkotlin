
fun main() {
    println("Factorial 9999 is: ${factorial(9999)}")
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}