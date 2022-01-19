fun main() {
    println(10.plusThree())


    var value: Int? = null

    print(value.slice) //

}


fun Int.plusThree(): Int {


    return this + 3



    println(10.slice)

    val value: Int? = null

    println(value.slice)


}

val Int.slice: Int
    get() = this / 2

//val Int?.slice: Int
//    get() = this?.div(2) ?: 0

val Int?.slice: Int
    get() = if (this == null) 0 else this / 2