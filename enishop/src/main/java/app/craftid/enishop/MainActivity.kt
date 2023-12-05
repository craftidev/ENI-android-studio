package app.craftid.enishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import app.craftid.enishop.databinding.ActivityMainBinding
import app.craftid.enishop.entities.Article
import app.craftid.enishop.repositories.ArticleRepository
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            val newArticle = Article(
                0,
                binding.title.text.toString(),
                binding.description.text.toString(),
                binding.price.text.toString().toDouble(),
                "fakeUrl",
                LocalDate.now()
            )

            Snackbar.make(it, "You created: ${newArticle.title}", Snackbar.LENGTH_SHORT)
                .show()

            val articleRepository = ArticleRepository
            articleRepository.create(newArticle)
        }
    }
}