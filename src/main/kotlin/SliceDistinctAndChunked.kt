fun main() {

    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)

    println(slice)

    val totals = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)

    val word = "ANNISA"
    val chunked = word.chunked(2)

    println(chunked)


}