package app.craftid.enishop.ui.articlecreate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.craftid.enishop.entities.Article
import app.craftid.enishop.repositories.ArticleRepository

class AddArticleViewModel: ViewModel() {
    var article = MutableLiveData<Article>()
    private val articleRepository = ArticleRepository

    init {
        article.value = articleRepository.getAllArticles().random()
    }

    fun create(): Long {
        return articleRepository.create(article.value!!)
    }

    fun getAllArticles(): List<Article> {
        return articleRepository.getAllArticles()
    }
}