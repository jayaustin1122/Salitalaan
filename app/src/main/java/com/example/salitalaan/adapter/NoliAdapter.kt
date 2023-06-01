package com.example.wika_runungan.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.salitalaan.databinding.NoliRowItemBinding
import com.example.wika_runungan.data.Noli
import java.util.*

class NoliAdapter(private val context: Context, var lists: MutableList<Noli>, private val onItemClickListener: (Int) -> Unit): RecyclerView.Adapter<NoliAdapter.NoliViewHolder>()   {
    inner class NoliViewHolder (val binding: NoliRowItemBinding):RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoliViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NoliRowItemBinding.inflate(layoutInflater,parent,false)
        return NoliViewHolder(binding)
    }
    fun onApplySearch(list: MutableList<Noli>){
        this.lists=list
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: NoliViewHolder, position: Int) {
        holder.binding.apply {
            imgBookCover.setImageResource(lists[position].Image)
            tvTitle.text = lists[position].title
        }
        // to make the viewcard functional
        holder.itemView.setOnClickListener(){
            onItemClickListener(position)
        }
    }

}
