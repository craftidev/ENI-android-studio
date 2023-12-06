package app.craftid.enishop.dal.network

import app.craftid.enishop.dal.ArticleDAO
import app.craftid.enishop.entities.Article

class ArticleDaoNetworkImpl: ArticleDAO {
    override fun selectById(id: Long): Article {
        TODO("Not yet implemented")
    }

    override fun create(article: Article): Long {
        TODO("Not yet implemented")
    }

    override fun selectAll(): List<Article> {
        TODO("Not yet implemented")
    }
}