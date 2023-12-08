package app.craftid.enishop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.craftid.enishop.databinding.ActivityHomeBinding
import app.craftid.enishop.ui.articlecreate.AddArticleActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addArticleFloatingActionButton.setOnClickListener {
            Intent(this, AddArticleActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}
