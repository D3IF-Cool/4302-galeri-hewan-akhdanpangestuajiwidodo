package org.d3if0008.galerihewan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if0008.galerihewan.databinding.ActivityMainBinding
import org.d3if0008.galerihewan.databinding.ListItemBinding

class MainAdapter(private val data: List<Hewan>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>(){
    class ViewHolder(private val binding: ListItemBinding) :
            RecyclerView.ViewHolder(binding.root){

        fun bind(hewan: Hewan) = with(binding){
            namaTextView.text = hewan.nama
            latinTextView.text = hewan.namaLatin
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}