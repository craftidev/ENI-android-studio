package app.craftid.enishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.craftid.enishop.databinding.ActivityAddArticleBinding
import app.craftid.enishop.entities.Article
import app.craftid.enishop.repositories.ArticleRepository
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate

class AddArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            val newArticle = Article(
                0,
                binding.title.text.toString(),
                binding.description.text.toString(),
                binding.price.text.toString().toDoubleOrNull() ?: - 1.0,
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