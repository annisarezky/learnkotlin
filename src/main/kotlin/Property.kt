import kotlin.reflect.KProperty

class Pet{
    var name: String = "Dicoding Momo"
}


fun main() {
    val cat = Pet()
    println("Nama: ${cat.name}" )
    cat.name = "Momo"
    println("Nama: ${cat.name}")



}

