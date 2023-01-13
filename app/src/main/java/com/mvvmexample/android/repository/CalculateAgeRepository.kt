package com.mvvmexample.android.repository

import androidx.lifecycle.MutableLiveData
import com.mvvmexample.android.model.Person

interface CalculateAgeRepository {

    fun calculateYourAge(name: String, age: Int): MutableLiveData<Person>

}