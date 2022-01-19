data class Item(val  key: String, val value: Any)


fun main() {
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Kotlin"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.value }
    distinctItems.forEach {
        println("${it.key} with value  ${it.value}")

    }
}