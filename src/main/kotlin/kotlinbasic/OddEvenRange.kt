package kotlinbasic

fun main(args: Array<String>) {
    print("Enter start value : ")
    val start = readLine()!!.toInt()
    print("Enter end value : ")
    val end = readLine()!!.toInt()

    displayEvenNos(start, end)
    println(" ")
    displayOddNos(start, end)
}

fun displayEvenNos(start : Int, end : Int) {
    print("Even numbers : ")
    for(i in start..end) {
        if(i % 2 == 0) {
            println(i);
        }
    }
}

fun displayOddNos(start : Int, end :  Int) {
    print("Even odd : ")
    for(i in start..end) {
        if(i % 2 != 0) {
            println(i);
        }
    }
}