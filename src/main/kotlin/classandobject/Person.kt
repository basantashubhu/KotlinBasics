package classandobject

class Person (val fname: String, val lname: String, val age: Int) {
    fun display() {
        println("First Name : ${fname}, Last Name : ${lname}, Age : ${age}")
    }
}

fun main(args: Array<String>) {
    val listPerson = mutableListOf<Person>()

    for (i in 0..2) {
        print("Enter first name : ")
        val fname = readLine()!!.toString()
        print("Enter last name : ")
        val lname = readLine()!!.toString()
        print("Enter age : ")
        val age = readLine()!!.toInt()

        listPerson.add(Person(fname, lname, age))
    }

    for (person in listPerson) {
        person.display()
    }
}