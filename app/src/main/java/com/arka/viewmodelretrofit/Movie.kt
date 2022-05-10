package com.arka.viewmodelretrofit

import com.google.gson.annotations.SerializedName

data class Movie (@SerializedName("Title") val title : String,@SerializedName("Poster") val poster : String,
val imdb : String, @SerializedName("Year") val year : String)