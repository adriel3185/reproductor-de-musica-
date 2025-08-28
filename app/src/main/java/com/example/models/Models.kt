package com.example.beat_fetch.models

data class Artist(
    val name: String,
    val imageUrl: String
)

data class Album(
    val title: String,
    val imageUrl: String
)

data class Genre(
    val name: String,
    val description: String,
    val backgroundColor: String
)
