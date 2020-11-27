package kotlinbasic

fun main(args: Array<String>) {
    print("What day is today? : ")
    val today = readLine()!!.toInt()

    when (today) {
        6 ->
            print("It is a happy holiday.")
        else ->
            print("It is a Weekday.")
    }
}