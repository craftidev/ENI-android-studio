package app.craftid.enishop.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Article (
    val id: Long,
    var title: String,
    var description: String,
    var price: Double,
    var imgUrl: String,
    val publishedDate: LocalDate
): Parcelable
