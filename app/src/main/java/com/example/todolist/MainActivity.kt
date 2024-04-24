package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = CaseAdapter()
    private var launcher: ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult->
            if(result.resultCode == RESULT_OK){
                val text = result.data?.getStringExtra(Constants.KEY)?:"(("
                adapter.addCase(text)
            }
        }
    }

    fun onClickAdd(view: View) {
        val intent = Intent(this, CreateCase::class.java)
        launcher?.launch(intent)
    }

    private fun init() {
        binding.apply {
            recyclerToDoList.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerToDoList.adapter = adapter
        }
    }
}