package com.example.cookbook

import android.media.Rating
import android.media.Rating.RATING_5_STARS
import java.util.*

data class Recipe(val id: UUID = UUID.randomUUID(),
                  var name: String = "",
                  var ingredients: MutableList<String> = mutableListOf<String>(""),
                  var description: String = "",
                  var dateAdded: Date = Date(),
                  var dateTried: Date = Date(),
                  var rating: Rating = Rating.newStarRating(RATING_5_STARS, 0.0f))
