package kotlinbasic

fun main(args: Array<String>) {
    print("Enter a number : ")

    val num = readLine()!!.toInt()

    displayFactorial(num)
}

fun displayFactorial(num: Int) {
    var fact = 1

    for (i in 1..num) {
        fact = fact * i
    }

    println("Factorial of $num is $fact.")
}