package arraybasic

fun main(args: Array<String>) {
    // int[] arr = {3, 2, 1}
    // int[] arr = new Int[5]
//    val arr = arrayOf(3, 2, 1)

    val arr = IntArray(5)
//    arr[0] = 3
//    arr[1] = 2
    for (i in arr.indices) {
        print("Enter element ${i + 1} : ")
        arr[i] = readLine()!!.toInt();
    }

    println("Elements of array")
    for (i in arr.indices) {
        println(arr[i])
    }
}