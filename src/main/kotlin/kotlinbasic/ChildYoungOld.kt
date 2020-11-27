package kotlinbasic

import java.lang.Exception

fun main(args: Array<String>) {
    print("Enter you age : ")
    val age = readLine()

    try {
        val intAge : Int = age!!.toInt()
        if (intAge <= 12) {
            print("You are a child.")
        } else if(intAge < 25) {
            print("You are young.")
        } else {
            print("You are old.")
        }
    }catch (e : Exception) {
        print("Invalid age input")
    }
}