class Cat(
    val name: String,
    val furColor: String,
    val weight: Double,
    val age: Integer,
    val numberOfFeet: Integer,
    val isCarnivore: Boolean
    ) {
    fun eat(){
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }

    fun playWithHuman() {
        println("$name bermain dengan Manusia!")
    }
}



open class Dori()

class Momo() : Dori()

class Miru() : Dori()

class Aiko() :  Dori()

