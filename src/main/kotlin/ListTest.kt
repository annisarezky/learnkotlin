fun main() {
    val anyList = mutableListOf('a', "Kotlin", 3, true, User("icha",15))

    anyList.add('d') // 'a', "Kotlin", 3, true, User, d
    anyList.add(1, "love") // 'a', "love", "Kotlin", 3, true, User, d
    anyList[3] = false // 'a',  "love", "Kotlin", false, 3, true, User, d
    anyList.removeAt(1) // 'a', "Kotlin", false, 3, true, User, d
}
