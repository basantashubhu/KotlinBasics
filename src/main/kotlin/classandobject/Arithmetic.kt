package classandobject

// Arithmetic
class Arithmetic {
    private var first : Int = 0
    private var second : Int = 0

    fun setFirst(_first: Int) {
        first = _first
    }

    fun getFirst(): Int {
        return first
    }

    fun setSecond(_second: Int) {
        second = _second
    }

    fun getSecond(): Int {
        return second
    }

    fun add() : Int {
        return first + second
    }

    fun subtract() : Int {
        return first - second
    }
}

fun main() {
    val arithmetic = Arithmetic()

    arithmetic.setFirst(5)
    arithmetic.setSecond(9)
    println("Sum of ${arithmetic.getFirst()} and ${arithmetic.getSecond()} is ${arithmetic.add()}")

    arithmetic.setFirst(20)
    arithmetic.setSecond(9)
    print("Differance of ${arithmetic.getFirst()} and ${arithmetic.getSecond()} is ${arithmetic.subtract()}")
}