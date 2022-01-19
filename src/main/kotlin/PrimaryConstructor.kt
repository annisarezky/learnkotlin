class Hewan(
    pName: String,
    pWeight: Double,
    pAge: Int
){

    init {
        println("nama $pName, umur $pAge, berat $pWeight")
    }
}

fun main() {
    val myCat = Hewan(
        pName = "Momo",
        pWeight = 2.5,
        pAge = 13
    )

    val myKitten = Hewan(
        pName = "Miru",
        pWeight = 1.5,
        pAge = 1
    )
}
