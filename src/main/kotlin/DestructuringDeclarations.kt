fun main() {
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}
