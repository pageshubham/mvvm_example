package com.mvvmexample.android.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import com.mvvmexample.android.R
import com.mvvmexample.android.viewmodel.CalculateAgeViewModel

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

    private val calculateAgeViewModel: CalculateAgeViewModel by viewModels()
    lateinit var textViewInfo: TextView
    lateinit var editTextName: EditText
    lateinit var editTextAge: EditText
    lateinit var buttonCalculateAge: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewInfo = findViewById(R.id.tv_your_age)
        editTextName = findViewById(R.id.et_name)
        editTextAge = findViewById(R.id.et_age)
        buttonCalculateAge = findViewById(R.id.bt_calculate)

        buttonCalculateAge.setOnClickListener {
            val name = editTextName.text.trim().toString()
            val age = editTextAge.text.trim().toString().toInt()
            calculateAgeViewModel.calculateAge(name, age).observe(this) {
                textViewInfo.text = "${it.name} your age: ${it.age}"
            }
        }

    } //onCreate()

}