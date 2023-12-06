package app.craftid.enishop.dal.memory

import android.os.Build
import androidx.annotation.RequiresApi
import app.craftid.enishop.dal.ArticleDAO
import app.craftid.enishop.entities.Article
import java.time.LocalDate
import java.util.Date

class ArticleDaoMemoryImpl: ArticleDAO {
    private val articlesInMemory = mutableListOf<Article>(
        Article(
            1,
            "title1",
            "description1",
            111.11,
            "#1",
            LocalDate.now()
        ),
        Article(
            2,
            "title2",
            "description2",
            222.22,
            "#2",
            LocalDate.now()
        ),
        Article(
            3,
            "title3",
            "description3",
            333.33,
            "#3",
            LocalDate.now()
        )
    )

    override fun selectById(id: Long): Article {
        return articlesInMemory.first { it.id == id }
    }

    override fun selectAll(): List<Article> {
        return articlesInMemory
    }

    override fun create(article: Article): Long {
        val newId: Long = articlesInMemory.size +1L
        articlesInMemory += Article(
            newId,
            article.title,
            article.description,
            article.price,
            article.imgUrl,
            article.publishedDate
        )
        return newId
    }
}