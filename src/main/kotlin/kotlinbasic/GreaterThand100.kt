package kotlinbasic

fun main(args: Array<String>) {
    print("Enter a number : ")
    val wholeNumber = readLine()!!.toInt()

    if (wholeNumber > 100) {
        print("$wholeNumber is greater than 100.")
    } else {
        print("$wholeNumber is not greater than 100.")
    }
}