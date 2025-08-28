package com.example.beat_fetch.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beat_fetch.R
import com.example.beat_fetch.models.Album

class AlbumAdapter(private val albums: List<Album>) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivAlbum)
        val titleTextView: TextView = itemView.findViewById(R.id.tvAlbumTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return AlbumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = albums[position]
        holder.titleTextView.text = album.title
        // Aquí cargarías la imagen con Glide o Picasso
        // Glide.with(holder.itemView.context).load(album.imageUrl).into(holder.imageView)

        // Por ahora, usaremos un placeholder
        holder.imageView.setImageResource(R.drawable.placeholder_album)
    }

    override fun getItemCount() = albums.size
}

