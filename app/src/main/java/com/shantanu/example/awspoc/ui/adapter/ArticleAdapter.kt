package com.shantanu.example.awspoc.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shantanu.example.awspoc.R
import com.shantanu.example.awspoc.data.local.model.Article

class ArticleAdapter(val articleList: ArrayList<Article>) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_row_article, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ArticleAdapter.ViewHolder, position: Int) {
        holder.bindItems(articleList[position])
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(article: Article) {
            val textViewTitle = itemView.findViewById(R.id.list_row_article_textview_title) as TextView
            val textViewDescription  = itemView.findViewById(R.id.list_row_article_textview_desciption) as TextView
            textViewTitle.text = article.title
            textViewDescription.text = article.tagline
        }
    }
}