package classandobject
//
//class ArithmeticConstructor(private val a : Int, private val b : Int){
//    fun sum(): Int {
//        return a + b
//    }
//}

class ArithmeticConstructor constructor(private val a : Int, private val b : Int){
    fun getA(): Int {
        return a
    }

    fun getB(): Int {
        return b
    }

    fun sum(): Int {
        return a + b
    }
}

fun main() {
    val arithmetic = ArithmeticConstructor(5, 9)

    print("Sum of ${arithmetic.getA()} and ${arithmetic.getB()} is ${arithmetic.sum()}")
}