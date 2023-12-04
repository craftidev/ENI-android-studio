package app.craftid.demokotlin

fun main(): Unit {
    val age = 15
    val age2 = 19
    val colors = arrayOf("Blue", "Red", "Green")

    val message = if(age == 18) "Adult" else "Minor"
    println(message)

    when(age2) {
        1,2 -> println("Baby")
        in 3..18 -> println("Minor")
        is Int -> println("Is integer")
        else -> println("Adult")
    }

    for (color in colors) {
        println(color)
    }
}