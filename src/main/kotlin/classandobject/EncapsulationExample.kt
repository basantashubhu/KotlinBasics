package classandobject

class EncapsulationExample (private val userID : Int){
    private var messages : Map<String, String> = emptyMap<String, String>()
    private var name : String = ""

    public fun getUserAndMessagesFromDatabase(): Boolean {
        getName()
        getMessages()
        return true
    }

    private fun getName() {
        name = "Hari"
    }

    private fun getMessages() {
        messages = mapOf<String, String>("Santosh" to "Hello Hari!", "Hari" to "hy Santosh, how are you?", "Kishor" to "Hello!")
    }

    public fun render() {
        for (key in messages.keys) {
            if (key == name) {
                println("From you: ${messages[key]}")
            } else {
                println("From $key: ${messages[key]}")
            }
        }
    }
}

fun main(args: Array<String>) {
    val messenger = EncapsulationExample(34)
    if(messenger.getUserAndMessagesFromDatabase()) {
        messenger.render()
    }
}