package com.example.proj21_dust.data.models.tmcoordinates


import com.google.gson.annotations.SerializedName

data class TmCoordinateResponse(
    @SerializedName("documents")
    val documents: List<Document>?,
    @SerializedName("meta")
    val meta: Meta?
)