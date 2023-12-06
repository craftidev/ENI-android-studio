package app.craftid.enishop.repositories

import app.craftid.enishop.dal.ArticleDAO
import app.craftid.enishop.dal.FactoryDao
import app.craftid.enishop.dal.TypeDao
import app.craftid.enishop.dal.memory.ArticleDaoMemoryImpl
import app.craftid.enishop.entities.Article
import java.time.LocalDate
import java.util.Date

object ArticleRepository {
    private val articleDaoMemoryManager = FactoryDao().createArticleDAO(TypeDao.MEMORY)
    private val articleDaoNetworkManager = FactoryDao().createArticleDAO(TypeDao.NETWORK)

    fun getArticleById(id: Long): Article {
        return articleDaoMemoryManager.selectById(id)
    }

    fun create(article: Article): Long {
        return articleDaoMemoryManager.create(article)
    }

    fun getAllArticles(): List<Article> {
        return articleDaoMemoryManager.selectAll()
    }
}
