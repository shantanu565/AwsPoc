package com.shantanu.example.awspoc.ui.feature.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.shantanu.example.awspoc.R
import com.shantanu.example.awspoc.data.local.model.User
import com.shantanu.example.awspoc.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var model: LoginViewModel
    private lateinit var binding:FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )

        model = ViewModelProviders.of(this)[LoginViewModel::class.java]
        binding.lifecycleOwner=activity
        binding.model=model

        activity?.let {
            model?.getUser()?.observe(it, Observer {
                Toast.makeText(activity,"Hello:" +it.name+" "+it.pass,Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_fragment_login_to_fragment_home)
            })
        }

        binding.fragmentLoginTextviewGoToRegister.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_login_to_fragment_registeration)
        }

       /* model.getUser().observe(activity, Observer {
            binding.fragmentLoginEdittextUsername.text=it.name

        })
        model.getUser().observe(activity, Observer {

        })*/



        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        observeViewModel(model)

      /*  binding.fragmentLoginTextviewGoToRegister.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_login_to_fragment_registeration)

        }*/
    }

    fun observeViewModel(viewModel: LoginViewModel?){


    }
}