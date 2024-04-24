package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.todolist.databinding.ActivityCreateCaseBinding

class CreateCase : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun onClickDone(view: View){
        val i = Intent()
        i.putExtra(Constants.KEY, binding.editTextNewCase.text.toString())
        setResult(RESULT_OK, i)
        finish()
    }
}