package app.craftid.demokotlin

const val test = "hello"
fun main() {
    val message by lazy { "Message: $test" }
    println(message)
    val string :String? = null
    println(string)
}
