package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.databinding.ActivityCreateCaseBinding
import com.example.todolist.databinding.ActivityMainBinding

class CreateCase : AppCompatActivity() {
    lateinit var binding: ActivityCreateCaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCaseBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_create_case)
    }
}