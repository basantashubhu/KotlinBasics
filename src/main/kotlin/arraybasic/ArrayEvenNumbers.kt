package arraybasic

fun main(args: Array<String>) {
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter element [$i] : ")
        arr[i] = readLine()!!.toInt()
    }

    println("Even numbers")
    for (i in arr.indices) {
        if(arr[i] % 2 == 0) {
            println(arr[i])
        }
    }
}