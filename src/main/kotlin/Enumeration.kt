

fun main() {

    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print(color)
    }

    val houses: Array<House> = House.values()
    houses.forEach { house ->
        println(house)
    }

    val myKitty: Array<MyCats> = MyCats.values()
    myKitty.forEach { myCats ->
        println(myCats)
    }

    val color : Color = Color.RED
    val house : House = House.ROOM
    val myCats : MyCats = MyCats.MOMO
    println(color.printValue())
    println(house)
    println(myCats)
}

/* enum class Color{
    RED, GREEN, BLUE
} */
enum class House{
    DOOR, CHAIR, WINDOW, ROOM, TOILET
}

enum class MyCats{
    DORI, MOMO, MIRU, AIKO
}

enum class Color(val value: Int){
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },

    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };



    abstract fun printValue()
}