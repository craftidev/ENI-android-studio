package app.craftid.viewdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import app.craftid.viewdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
//      val button = findViewById<Button>(R.id.button)
        val foo = User("Pat", "Bateman", 23, "psycho@killer.co")
//        binding.textViewAge.text = foo.age
        binding.user = foo
        binding.button.setOnClickListener {
            binding.textViewHelloWorld.text = "Button clicked"
        }
    }
}