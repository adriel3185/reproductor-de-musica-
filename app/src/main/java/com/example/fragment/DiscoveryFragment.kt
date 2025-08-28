package com.example.beat_fetch.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beat_fetch.R
import com.example.beat_fetch.adapters.GenreAdapter
import com.example.beat_fetch.models.Genre

class DiscoveryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_discovery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupGenresRecyclerView(view)
    }

    private fun setupGenresRecyclerView(view: View) {
        val recyclerViewGenres = view.findViewById<RecyclerView>(R.id.recyclerViewGenres)
        val genres = getSampleGenres()

        val genreAdapter = GenreAdapter(genres)
        recyclerViewGenres.layoutManager = GridLayoutManager(context, 2)
        recyclerViewGenres.adapter = genreAdapter
    }

    private fun getSampleGenres(): List<Genre> {
        return listOf(
            Genre("Rap en Español", "Lo Mejor del Rap", "#FF6B6B"),
            Genre("Rock n Roll", "Lo Mejor Del Rock n Roll", "#4ECDC4")
        )
    }
}

