package app.craftid.demokotlin

import java.time.LocalDateTime

fun LocalDateTime.showHM() {
    println("Hours: ${this.hour}")
    println("Minutes: ${this.minute}")
}

fun main() {
    LocalDateTime.now().showHM()
    var elvis: String? = "Hello world"
    val taille: Int = elvis?.length ?: -1

    val collectionColors = mutableListOf<String>()
    collectionColors += "Green"
    collectionColors += "Blue"
    collectionColors += "Red"

    val nbRed = collectionColors.count {
        red -> red == "Red" || red == "red"
    }

    val sumChars = collectionColors.sumOf {
        it.length
    }

    println(sumChars)
}