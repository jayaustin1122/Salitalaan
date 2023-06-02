package com.example.salitalaan.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.salitalaan.databinding.GlosaryItemRowBinding
import com.example.wika_runungan.data.Glosary

class GlosaryAdapter(var list:MutableList<Glosary>): RecyclerView.Adapter<GlosaryAdapter.ViewHolderAdapter>(){
    var onItemClick : ((Glosary)-> Unit)? = null

    inner class ViewHolderAdapter(val binding: GlosaryItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAdapter {
        val inflater = LayoutInflater.from(parent.context)
        val binding = GlosaryItemRowBinding.inflate(inflater, parent, false)
        return ViewHolderAdapter(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderAdapter, position: Int) {
        holder.binding.apply {
            title.text = list[position].title
        }
        // to make the viewcard functional
        holder.itemView.setOnClickListener(){
            onItemClick?.invoke(list[position])

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun onApplySearch(list: ArrayList<Glosary>){
        this.list=list
        notifyDataSetChanged()
    }
}