package com.androxus.section3viewmodel

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private var num=0

    var total=MutableLiveData<Int>()



    init {
        total.value=0
    }

    fun settotal(){
        total.value=(total.value)?.plus(1)
    }

}

