package generictest

//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /*..*/
//    }
//}
//
//fun main() {
//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>()
//}

abstract class Vehicle(wheeel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100) , Car(120))
    val vehicleList = carList
}
