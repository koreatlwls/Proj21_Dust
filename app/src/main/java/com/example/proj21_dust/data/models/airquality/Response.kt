package com.example.proj21_dust.data.models.airquality


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("body")
    val body: Body?,
    @SerializedName("header")
    val header: Header?
)