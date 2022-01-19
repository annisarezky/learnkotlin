package interfaces

interface IFly {
    fun fly()
    val numberOfWings: Int

    fun eat()
}

class Bird(
    override val numberOfWings: Int
) : IFly {
    override fun fly() {
        println("I flying without wings")
    }

    override fun eat() {
        println("I eat fish")
        //
    }

}

fun main() {
    val bird = Bird(10)
    bird.fly()
    bird.eat()
}




// interface itu blueprint yang bisa di pakai/di
// implement function nya oleh class lain