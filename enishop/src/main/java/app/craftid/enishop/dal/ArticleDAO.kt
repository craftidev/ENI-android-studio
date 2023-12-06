package app.craftid.enishop.dal

import app.craftid.enishop.entities.Article

interface ArticleDAO {
    fun selectById(id: Long): Article
    fun create(article: Article): Long
    fun selectAll(): List<Article>
}