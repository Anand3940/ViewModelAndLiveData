package com.example.frag
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthViewModel :ViewModel() {
var total=MutableLiveData<Int>()
    init {
        total.value=0
    }

    fun setNumber(){
     total.value=(total.value)?.plus(1)
    }

}