package arraybasic

fun main(args: Array<String>) {
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter element [$i] : ")
        arr[i] = readLine()!!.toInt()
    }

    var sum : Int = 0
    for (i in arr.indices) {
        if (arr[i] % 2 != 0) {
            sum += arr[i]
        }
    }
    print("The sum is $sum.")
}