package app.craftid.enishop.ui.articlecreate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import app.craftid.enishop.databinding.ActivityAddArticleBinding
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate

class AddArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddArticleBinding
    private val addArticleViewModel by viewModels<AddArticleViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddArticleBinding.inflate(layoutInflater)
        binding.addArticleViewModel = addArticleViewModel
        binding.lifecycleOwner = this
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            Snackbar.make(
                it,
                "You created: ${binding.title}",
                Snackbar.LENGTH_LONG
            ).show()

            Log.d("articleState", addArticleViewModel.article.toString())
            addArticleViewModel.create()
            Log.d("articleList", addArticleViewModel.getAllArticles().toString())
            finish()
        }
    }
}