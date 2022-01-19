fun main() {
    loop1@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break

        }
    }
        val listOfInt = listOf(1, 2, 3, null, 5, null, 7)


    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

    newFun()
}

fun newFun() {
    val listNumber = 1.rangeTo(100)
    listNumber.forEach { number ->
        if (number %2 == 1)
            println(number)

    }

}