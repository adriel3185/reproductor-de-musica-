package com.example.beat_fetch.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beat_fetch.R
import com.example.beat_fetch.adapters.ArtistAdapter
import com.example.beat_fetch.adapters.AlbumAdapter
import com.example.beat_fetch.models.Artist
import com.example.beat_fetch.models.Album

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupArtistsRecyclerView(view)
        setupAlbumsRecyclerView(view)
    }

    private fun setupArtistsRecyclerView(view: View) {
        val recyclerViewArtists = view.findViewById<RecyclerView>(R.id.recyclerViewArtists)
        val artists = getSampleArtists()

        val artistAdapter = ArtistAdapter(artists)
        recyclerViewArtists.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewArtists.adapter = artistAdapter
    }

    private fun setupAlbumsRecyclerView(view: View) {
        val recyclerViewAlbums = view.findViewById<RecyclerView>(R.id.recyclerViewAlbums)
        val albums = getSampleAlbums()

        val albumAdapter = AlbumAdapter(albums)
        recyclerViewAlbums.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewAlbums.adapter = albumAdapter
    }

    private fun getSampleArtists(): List<Artist> {
        return listOf(
            Artist("The Weeknd", "https://via.placeholder.com/100"),
            Artist("Eminem", "https://via.placeholder.com/100"),
            Artist("Zoe", "https://via.placeholder.com/100"),
            Artist("Cadete", "https://via.placeholder.com/100")
        )
    }

    private fun getSampleAlbums(): List<Album> {
        return listOf(
            Album("Dawn FM 2022", "https://via.placeholder.com/150"),
            Album("INCOMODO 2021", "https://via.placeholder.com/150"),
            Album("Manu 2020", "https://via.placeholder.com/150")
        )
    }
}

