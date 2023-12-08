package app.craftid.enishop.ui.articlelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.craftid.enishop.entities.Article
import app.craftid.enishop.repositories.ArticleRepository

class ArticleListViewModel: ViewModel() {
    var articles = MutableLiveData<List<Article>>()
    private val articleRepository = ArticleRepository

    init {
        articles.value = articleRepository.getAllArticles()
    }
}