package kotlinbasic

fun main(args : Array<String>) {
    print("Enter you salary : ")
    val salary = readLine()!!.toInt()

    if (salary > 200000) {
        print("You have to pay tax.")
    } else {
        print("You don't have to pay tax.")
    }
}