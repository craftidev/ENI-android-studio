package app.craftid.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        Toast.makeText(
            this,
            intent.getStringExtra(EXTRA_STRING_NUMBER),
            Toast.LENGTH_SHORT
        ).show()
    }
}