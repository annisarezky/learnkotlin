fun main() {
    val someString = "123" // string
    val someInt = someString.toInt() // int
    val someOtherString = "12.34" // string
    val someDouble = someOtherString.toDouble() // double

    println(someInt is Int)
    println(someDouble is Double)
}

/**
 * int = bilangan bulat
 * example: 1, 3, 5, 8, 100, 10000000
 *
 * double = bilangan pecahan
 * example: 1,5  2,5   9.5   8,2
 * */