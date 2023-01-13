package com.mvvmexample.android.repository

import androidx.lifecycle.MutableLiveData
import com.mvvmexample.android.model.Person
import java.util.Calendar

class CalculateAgeRepositoryImpl: CalculateAgeRepository {

    override fun calculateYourAge(name: String, age: Int): MutableLiveData<Person> {
        val infoMutableLiveDate = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - age
        val person = Person(name, yourAge)
        infoMutableLiveDate.postValue(person)
        return infoMutableLiveDate
    }

}