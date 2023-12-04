package app.craftid.demokotlin

fun main() {
    val newPerson = Child("Pat", "Bateman")
    newPerson.hello()
    println(newPerson.surname2)
}

open class Person(val surname: String, val name: String) {
    open fun hello() = println("Hello $surname $name")
}

class Child(val surname2: String, val name2: String): Person(surname2, name2) {
    override fun hello(){
        println("Hello CHILD: $surname2, $name2")
    }
}