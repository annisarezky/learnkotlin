fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5) // 1,2,4,5
    val setB = setOf(1, 2, 4, 5) // 1,2,4,5
    println(setA == setB)

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    println(multipliedBy5)

    val numberList1  = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.count())

    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}