package com.example.challenge4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportsAdapter(private val sportsList: List<Sport>) :
    RecyclerView.Adapter<SportsAdapter.SportViewHolder>() {

    class SportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sportImage: ImageView = itemView.findViewById(R.id.sportImage)
        val sportName: TextView = itemView.findViewById(R.id.sportName)
        val sportDescription: TextView = itemView.findViewById(R.id.sportDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sport_card, parent, false)
        return SportViewHolder(view)
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        val sport = sportsList[position]
        holder.sportName.text = sport.name
        holder.sportDescription.text = sport.description
        holder.sportImage.setImageResource(sport.imageResourceId)
    }

    override fun getItemCount(): Int = sportsList.size
}