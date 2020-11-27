package arraybasic

fun main(args: Array<String>) {
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter element [$i]")
        arr[i] = readLine()!!.toInt()
    }

    val sortedArr = IntArray(5)
    for (i in arr.indices) {
        for(j in arr.indices) {
            if (arr[i] < arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

}