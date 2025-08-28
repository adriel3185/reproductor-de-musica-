package com.example.beat_fetch.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beat_fetch.R
import com.example.beat_fetch.models.Artist

class ArtistAdapter(private val artists: List<Artist>) : RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>() {

    class ArtistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivArtist)
        val nameTextView: TextView = itemView.findViewById(R.id.tvArtistName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_artist, parent, false)
        return ArtistViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val artist = artists[position]
        holder.nameTextView.text = artist.name
        // Aquí cargarías la imagen con Glide o Picasso
        // Glide.with(holder.itemView.context).load(artist.imageUrl).into(holder.imageView)

        // Por ahora, usaremos un placeholder
        holder.imageView.setImageResource(R.drawable.placeholder_artist)
    }

    override fun getItemCount() = artists.size
}