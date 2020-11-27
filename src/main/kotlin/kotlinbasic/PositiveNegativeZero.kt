package kotlinbasic

fun main(args: Array<String>) {
    print("Enter a number : ")
    val number = readLine()!!.toInt()

    if (number > 0) {
        print("Positive number.")
    } else if(number < 0) {
        print("Negative number.")
    } else {
        print("Number is 0.")
    }
}