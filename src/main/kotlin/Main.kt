
fun main() {
    println("Welcome to the Calcuverter!")
    println("Here you will be able to use a Calculator and Temp Converter.")
    println("Which would you like to use?")
    println("1. Calculator 2.Converter")
    val read = readln()
    when (read.toInt()) {
        1 -> calculator()
        2 -> converter()
        else -> println("Invalid, Goodbye")

    }
}
class Enum {
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0
    var num5 = 0
    var sol = 0
}
fun calculator() {
            println("Welcome to the Calcuverter Calculator!")
            println("Before we start this calculator is capable of doing operations using up to 5 numbers.")
            println("Would you like to do an operation with more than 2 operators?")
            println("1. Yes 2. No")
            val more = readln().toInt()
            if (more ==1){
                println("How many numbers would you like to add? (limit 3 more #s)")
                when(readln().toInt()){
                    1-> op1()
                    2-> op2()
                    3-> op3()
                }

            } else {
                basicOp()
            }
}
fun basicOp(){

    val e = Enum()
    println("Please enter your first number")
    e.num1 = readln().toInt()
    println("Please enter your second number")
    e.num2 = readln().toInt()
    println("1. Add 2. Subtract 3. Multiply 4. Divide")
    println("Please Enter the Number for the Operator you would like to use.")
    when (readln().toInt()) {
        1 -> e.sol = e.num1 + e.num2
        2 -> e.sol = e.num1 - e.num2
        3 -> e.sol = e.num1 * e.num2
        4 -> e.sol = e.num1 / e.num2
        else -> println("Invalid, Goodbye")
    }
    println("The solution is " + e.sol)
    println("Would you like to do another operation?")
    println("Please enter 1 or 2. 1. Yes 2. No")
    when(readln().toInt()) {
        1 -> calculator()
        2 -> println("Goodbye!")
}}
fun op1() {
    val e = Enum()
    println("Please enter your first number")
    e.num1 = readln().toInt()
    println("Please enter your second number")
    e.num2 = readln().toInt()
    println("Please enter your third number")
    e.num3 = readln().toInt()
    println("1. Add 2. Subtract 3. Multiply 4. Divide")
    println("Please Enter the Number for the Operator you would like to use.")
    when (readln().toInt()) {
        1 -> e.sol = e.num1 + e.num2 + e.num3
        2 -> e.sol = e.num1 - e.num2 - e.num3
        3 -> e.sol = e.num1 * e.num2 * e.num3
        4 -> e.sol = e.num1 / e.num2 / e.num3
        else -> println("Invalid, Goodbye")
    }
    println("The solution is " + e.sol)
    println("Would you like to do another operation?")
    println("Please enter 1 or 2. 1. Yes 2. No")
    when(readln().toInt()) {
        1 -> calculator()
        2 -> println("Goodbye!")
    }
}

fun op2(){
    val e = Enum()
    println("Please enter your first number")
    e.num1 = readln().toInt()
    println("Please enter your second number")
    e.num2 = readln().toInt()
    println("Please enter your third number")
    e.num3 = readln().toInt()
    println("Please enter your fourth number")
    e.num4 = readln().toInt()
    println("1. Add 2. Subtract 3. Multiply 4. Divide")
    println("Please Enter the Number for the Operator you would like to use.")
    when (readln().toInt()) {
        1 -> e.sol = e.num1 + e.num2 + e.num3 + e.num4
        2 -> e.sol = e.num1 - e.num2 - e.num3 - e.num4
        3 -> e.sol = e.num1 * e.num2 * e.num3 * e.num4
        4 -> e.sol = e.num1 / e.num2 / e.num3 / e.num4
        else -> println("Invalid, Goodbye")
    }
    println("The solution is " + e.sol)
    println("Would you like to do another operation?")
    println("Please enter 1 or 2. 1. Yes 2. No")
    when(readln().toInt()) {
        1 -> calculator()
        2 -> println("Goodbye!")
    }
}

fun op3(){
    val e = Enum()
    println("Please enter your first number")
    e.num1 = readln().toInt()
    println("Please enter your second number")
    e.num2 = readln().toInt()
    println("Please enter your third number")
    e.num3 = readln().toInt()
    println("Please enter your fourth number")
    e.num4 = readln().toInt()
    println("Please enter your fifth number")
    e.num5 = readln().toInt()
    println("1. Add 2. Subtract 3. Multiply 4. Divide")
    println("Please Enter the Number for the Operator you would like to use.")
    when (readln().toInt()) {
        1 -> e.sol = e.num1 + e.num2 + e.num3 + e.num4 + e.num5
        2 -> e.sol = e.num1 - e.num2 - e.num3 - e.num4 - e.num5
        3 -> e.sol = e.num1 * e.num2 * e.num3 * e.num4 * e.num5
        4 -> e.sol = e.num1 / e.num2 / e.num3 / e.num4 / e.num5
        else -> println("Invalid, Goodbye")
    }
    println("The solution is " + e.sol)
    println("Would you like to do another operation?")
    println("Please enter 1 or 2. 1. Yes 2. No")
    when(readln().toInt()) {
        1 -> calculator()
        2 -> println("Goodbye!")
    }
}

fun converter() {

    var solu = 0
    println("Welcome to our temp converter!")
    println("Please enter the temperature")
    val temp = readln().toInt()
    println("What will we be converting to today? (Enter Number)")
    println("1. Celsius to Fahrenheit 2. Fahrenheit to Celsius")
    val choice = readln().toInt()
    if (choice == 1){
         solu = (temp * 9/5) + 32
        println("The new temp is " + solu + " Fahrenheit")

    } else {
        solu = (temp - 32) * 5/9
        println("The new temp is " + solu + " Celsius")
    }
}