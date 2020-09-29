package com.example.task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var data: List<item>? = null

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var text: TextView = item.findViewById(R.id.item_details_tv)
        var time: TextView = item.findViewById(R.id.item_time_tv)
        var info: TextView = item.findViewById(R.id.item_info_tv)
        var attendence: TextView = item.findViewById(R.id.item_attendence_tv)
        var helpType: TextView = item.findViewById(R.id.item_help_type_tv)
        var img: ImageView = item.findViewById(R.id.item_img)
    }

    fun changeData(item: List<item>) {
        data = item
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_timeline, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.text.text = item.txt
        holder.attendence.text = item.attendence
        holder.time.text = item.time
        holder.helpType.text = item.type
        holder.info.text = item.info
        holder.img.setImageResource(item.image!!)
    }
}