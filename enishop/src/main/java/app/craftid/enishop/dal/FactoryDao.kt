package app.craftid.enishop.dal

import app.craftid.enishop.dal.memory.ArticleDaoMemoryImpl
import app.craftid.enishop.dal.network.ArticleDaoNetworkImpl

class FactoryDao {
    private val articleDaoMemoryImpl: ArticleDaoMemoryImpl = ArticleDaoMemoryImpl()
    private val articleDaoNetworkImpl: ArticleDaoNetworkImpl = ArticleDaoNetworkImpl()

    fun createArticleDAO(type: TypeDao): ArticleDAO {
        return when (type) {
            TypeDao.MEMORY -> {
                this.articleDaoMemoryImpl
            }
            TypeDao.NETWORK -> {
                this.articleDaoNetworkImpl
            }
        }
    }
}
