package com.shantanu.example.awspoc.ui.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shantanu.example.awspoc.R
import com.shantanu.example.awspoc.data.local.model.Article
import com.shantanu.example.awspoc.databinding.FragmentHomeBinding
import com.shantanu.example.awspoc.databinding.FragmentLoginBinding
import com.shantanu.example.awspoc.databinding.FragmentRegistrationBinding
import com.shantanu.example.awspoc.ui.adapter.ArticleAdapter
import com.shantanu.example.awspoc.ui.feature.register.RegistrationViewModel

class HomeFragment : Fragment() {
    private lateinit var model: HomeViewModel
    private lateinit var binding: FragmentHomeBinding
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )

        model = ViewModelProviders.of(this)[HomeViewModel::class.java]
        Toast.makeText(activity,"home fragment",Toast.LENGTH_SHORT).show()

        var articleList= arrayListOf<Article>()
        articleList.add(Article("1","Importance of tree","Preview Here"))
        articleList.add(Article("1","Importance of tree","Preview Here"))
        articleList.add(Article("1","Importance of tree","Preview Here"))
        articleList.add(Article("1","Importance of tree","Preview Here"))
        articleList.add(Article("1","Importance of tree","Preview Here"))

        layoutManager=LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        val articleAdapter=ArticleAdapter(articleList)

        binding.fragmentHomeRecyclerviewArticle.apply {
            this.layoutManager=layoutManager
            this.adapter=articleAdapter


        }

        return binding.root
    }
}