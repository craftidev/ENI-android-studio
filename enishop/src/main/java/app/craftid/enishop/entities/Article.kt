package app.craftid.enishop.entities

import java.time.LocalDate

data class Article (
    val id: Long,
    var title: String,
    var description: String,
    var price: Double,
    var imgUrl: String,
    var publishedDate: LocalDate
)
