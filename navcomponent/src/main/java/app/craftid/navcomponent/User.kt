package app.craftid.navcomponent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val surname: String,
    val name: String,
    val age: Int,
    val email: String
): Parcelable