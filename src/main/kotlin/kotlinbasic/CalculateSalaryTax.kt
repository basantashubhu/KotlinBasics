package kotlinbasic

fun main(args: Array<String>) {
    print("Enter you monthly salary : ")

    val salary = readLine()!!.toInt()
    val tax : Double

    when(salary) {
        in 1..200000 -> tax = salary * 0.01
        in 200000..350000 -> tax = ((salary - 200000) * 0.15) + ((200000 * 0.01))
//        in 3500000..Int.MAX_VALUE ->
    }
}