package abstractclass

abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main() {
//    baris ini akan error karena tidak boleh buat object/instance dari abstract class
//    val animal = Animal("Aiko", 3.6,1, true)


}