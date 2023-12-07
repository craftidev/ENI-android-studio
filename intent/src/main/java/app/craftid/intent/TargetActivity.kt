package app.craftid.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        val number = intent.getStringExtra(EXTRA_STRING_NUMBER) ?: "Default value"
        Log.d("TargetActivity", "Number received: $number")
//        Toast.makeText(this, number, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(android.R.id.content), number, Snackbar.LENGTH_LONG).show()

    }
}