package com.ysanjeet535.androidrichtexteditorexploration.data

import java.util.*

data class Library(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val stars: Int
) {
    companion object {
        fun getDummy() = Library(
            id = "0",
            name = "Android Editor",
            stars = 13
        )
    }
}

val exploredLibraries = mutableListOf<Library>(
    Library(name = "wasabeef/richeditor-android", stars = 5918)
)
