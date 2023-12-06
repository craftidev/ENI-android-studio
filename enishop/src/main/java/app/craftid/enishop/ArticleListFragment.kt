package app.craftid.enishop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import app.craftid.enishop.entities.Article
import app.craftid.enishop.repositories.ArticleRepository

class ArticleListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Detail Button
        val detailButton = view.findViewById<Button>(R.id.goDetailButton)

        detailButton.setOnClickListener {
            findNavController().navigate(R.id.actionListToDetail)
        }

        // List of articles
        val articleListDisplayContainer = view.findViewById<TextView>(R.id.articleListDisplayContainer)

        val articleRepository = ArticleRepository
        val articles: List<Article> = articleRepository.getAllArticles()
        var text = String()
        for (article in articles) {
            text += article.title
        }
        articleListDisplayContainer.text = text
    }
}