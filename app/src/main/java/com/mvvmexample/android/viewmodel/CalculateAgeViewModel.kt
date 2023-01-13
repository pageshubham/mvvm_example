package com.mvvmexample.android.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mvvmexample.android.model.Person
import com.mvvmexample.android.repository.CalculateAgeRepository
import com.mvvmexample.android.repository.CalculateAgeRepositoryImpl

class CalculateAgeViewModel: ViewModel() {

    val calculateAgeRepo: CalculateAgeRepository = CalculateAgeRepositoryImpl()

    fun calculateAge(name: String, age: Int): LiveData<Person> {
        val personMutableLiveData = calculateAgeRepo.calculateYourAge(name, age)
        return personMutableLiveData
    }

}