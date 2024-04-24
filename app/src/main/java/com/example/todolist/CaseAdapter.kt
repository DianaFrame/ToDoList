package com.example.todolist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.NewCaseBinding

class CaseAdapter: RecyclerView.Adapter<CaseAdapter.CaseHolder>() {
    private val textList = ArrayList<String>()
    class CaseHolder(item: View): RecyclerView.ViewHolder(item){
        private var binding = NewCaseBinding.bind(item)
        fun bind(text: String){
            binding.checkBoxCase.text = text
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaseHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.new_case, parent, false)
        return CaseHolder(view)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    override fun onBindViewHolder(holder: CaseHolder, position: Int) {
        holder.bind(textList[position])
    }
    fun addCase(text: String){
        textList.add(text)
        notifyDataSetChanged()
    }
}