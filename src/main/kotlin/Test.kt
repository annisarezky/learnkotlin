fun main() {
    println(add(19,10))
    println(substract(25,7))
    println(multiply(19,5))
    println(append("Momo", "Kiyowo"))
    office()

}

/**
 * @functionName: append
 * @param1: word1, type: String
 * @param1: word2, type: String
 * @description: append the word1 word2
 * @return: type: String
 * */

fun append(word1: String, word2: String) : String{
    return "$word1 $word2"
}
/**
 * @functionName: add
 * @param1: number1, type: Int
 * @param1: number2, type: Int
 * @description: count total from number1 + number2
 * @return: type: Int
 * */
fun add(number1: Int, number2: Int) :Int {
    return number1 + number2
}

/**
 * @functionName: substraction
 * @param1: number1, type: Int
 * @param1: number2, type: Int
 * @description: count result from number1 - number2
 * @return: type: Int
 * */

fun substract(number1: Int, number2: Int) :Int {
    return number1 - number2
}


/**
 * @functionName: multiply
 * @param1: number1, type: Int
 * @param1: number2, type: Int
 * @description: count result from number1 * number2
 * @return: type: Int
 * */

fun multiply(number1: Int, number2: Int) : Int {
    return number1 * number2
}

fun office(){
    val openHours = 7
    val now = 8
    var office: String
        office = if (now > 7) {
            "Office already open"
        } else if (now == openHours){
            "Wait a minute, office will be open"
        } else {
            "Office is closed"
        }

    print(office)
}