package com.shantanu.example.awspoc.ui.feature.login

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shantanu.example.awspoc.data.local.model.User

class LoginViewModel : ViewModel() {
    var emailAddress = MutableLiveData<String>()
    var password = MutableLiveData<String>()

    private var userMutableLiveData: MutableLiveData<User>? = null

    fun getUser(): MutableLiveData<User> {

        if (userMutableLiveData == null) {
            userMutableLiveData = MutableLiveData<User>()
        }
        return userMutableLiveData as MutableLiveData<User>

    }

    fun saveUser(email: String, password: String) {

        val loginUser = User(email,password)

        userMutableLiveData?.setValue(loginUser)
       // Log.v("check ","value")

    }

}