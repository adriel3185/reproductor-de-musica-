package com.example.beat_fetch.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beat_fetch.R
import com.example.beat_fetch.models.Genre

class GenreAdapter(private val genres: List<Genre>) : RecyclerView.Adapter<GenreAdapter.GenreViewHolder>() {

    class GenreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val container: LinearLayout = itemView.findViewById(R.id.genreContainer)
        val nameTextView: TextView = itemView.findViewById(R.id.tvGenreName)
        val descriptionTextView: TextView = itemView.findViewById(R.id.tvGenreDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false)
        return GenreViewHolder(view)
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        val genre = genres[position]
        holder.nameTextView.text = genre.name
        holder.descriptionTextView.text = genre.description

        try {
            holder.container.setBackgroundColor(Color.parseColor(genre.backgroundColor))
        } catch (e: IllegalArgumentException) {
            // Fallback color if parsing fails
            holder.container.setBackgroundColor(Color.parseColor("#333333"))
        }
    }

    override fun getItemCount() = genres.size
}
