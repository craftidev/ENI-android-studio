package app.craftid.intent

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

const val EXTRA_STRING_NUMBER = "number"

class MainActivity : AppCompatActivity() {
    private val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
        isGranted -> if (isGranted) {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel: 234234234")))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitButton = findViewById<Button>(R.id.explicitButton)
        explicitButton.setOnClickListener {
            Intent(this, TargetActivity::class.java).apply {
                putExtra(EXTRA_STRING_NUMBER, "1233523265")
                startActivity(this)
            }
        }

        val showPhoneNumberButton = findViewById<Button>(R.id.viewPhoneButton)
        showPhoneNumberButton.setOnClickListener {
            Intent(Intent.ACTION_DIAL, Uri.parse("tel: 234234234")).apply {
                startActivity(this)
            }
        }

        val callPhoneNumber = findViewById<Button>(R.id.callPhoneButton)
        callPhoneNumber.setOnClickListener {
            requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
        }
    }
}