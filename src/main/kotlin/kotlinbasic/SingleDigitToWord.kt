package kotlinbasic

fun main(args: Array<String>) {
    print("Enter a single digit number : ")
    val num = readLine()!!.toInt()

    when(num) {
        0 -> print("Zero")
        1 -> print("One")
        2 -> print("Two")
        3 -> print("Three")
        4 -> print("Four")
        5 -> print("Five")
        6 -> print("Six")
        7 -> print("Seven")
        8 -> print("Eight")
        9 -> print("Nine")
    }
}