package classandobject

abstract class Payment(
        private val cardNumber: String,
        private val expDate: String,
        private val cvv: String,
        private val cardType: String,
        private val cardHolder: String
) {
    open fun makePayment(vendorID: String) {
        throw Exception("No payment gateway available!")
    }
}


class Esewa(private val cardNumber: String,
            private val expDate: String,
            private val cvv: String,
            private val cardType: String,
            private val cardHolder: String
): Payment(cardNumber, expDate, cvv, cardType, cardHolder) {

    override fun makePayment(vendorID: String) {
        print("payment by esewa")
    }
}

class Khalti(private val cardNumber: String,
            private val expDate: String,
            private val cvv: String,
            private val cardType: String,
            private val cardHolder: String
): Payment(cardNumber, expDate, cvv, cardType, cardHolder) {

    override fun makePayment(vendorID: String) {
        print("payment by khalti")
    }
}

fun main(args: Array<String>) {
    print("Enter your card number: ")
    val cardNumber = readLine()!!.toString()
    print("Enter your card expiry date(mm/yyyy): ")
    val expDate = readLine()!!.toString()
    print("Enter your cvv: ")
    val cvv = readLine()!!.toString()
    print("Enter your card type(visa/mastercard): ")
    val cardType = readLine()!!.toString()
    print("Enter your name(card holder): ")
    val cardHolder = readLine()!!.toString()

    print("Enter payment gateway(esewa/khalti): ")
    val gatewaySelected = readLine()!!.toString()

    var gateway : Payment

    when(gatewaySelected) {
        "esewa" ->
            gateway = Esewa(cardNumber, expDate, cvv, cardType, cardHolder)
//            gateway.makePayment("3334445555")

        "khalti" ->
            gateway = Khalti(cardNumber, expDate, cvv, cardType, cardHolder)
//            gateway.makePayment("3334445555")

        else ->
            print("Invalid payment gateway!")
    }
}