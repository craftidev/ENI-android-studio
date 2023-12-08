package app.craftid.enishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.craftid.enishop.databinding.ActivityAddArticleBinding
import app.craftid.enishop.repositories.ArticleRepository
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate

class AddArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val articleRepository = ArticleRepository
        binding.article = articleRepository.getArticleById(1L)

        binding.submit.setOnClickListener {
            Snackbar.make(
                it,
                "You created: ${binding.title}",
                Snackbar.LENGTH_LONG
            ).show()

            val newArticle = binding.article!!.copy(
                id = 0,
                imgUrl = "fakeUrl",
                price = binding.price.text.toString().toDouble(),
                publishedDate = LocalDate.now()
            )

            articleRepository.create(newArticle)
            finish()
        }
    }
}