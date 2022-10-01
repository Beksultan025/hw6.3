package com.example.hw63

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw63.databinding.ItemBinding
import kotlin.reflect.KFunction1

class MainAdapter(private val data: ArrayList<Model>, private val onClick: (String) -> Unit):
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    //return ViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size

    inner class ViewHolder(private var binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Model) {
            binding.nameOfSong.text = model.name
            binding.number.text = model.number.toString()
            binding.singer.text = model.singer
            binding.time.text = model.time

            itemView.setOnClickListener {
                onClick(model.name)
            }
        }
    }
}