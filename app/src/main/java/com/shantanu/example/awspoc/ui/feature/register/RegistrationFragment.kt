package com.shantanu.example.awspoc.ui.feature.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.shantanu.example.awspoc.R
import com.shantanu.example.awspoc.databinding.FragmentLoginBinding
import com.shantanu.example.awspoc.databinding.FragmentRegistrationBinding
import com.shantanu.example.awspoc.ui.feature.login.LoginViewModel

class RegistrationFragment : Fragment() {
    private lateinit var model: RegistrationViewModel
    private lateinit var binding:FragmentRegistrationBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_registration, container, false
        )
        model = ViewModelProviders.of(this)[RegistrationViewModel::class.java]

        binding.fragmentRegisterationTextviewBackToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_registeration_to_fragment_login)
        }


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
}