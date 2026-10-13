package com.example.liverpool_miguel.model

data class Producto(
    val id: String = "", 
    val brand: String,
    val name: String,
    val price: Double,
    val rating: Float,
    val reviewCount: Int,
    val isFreeShipping: Boolean = true,
    val description: String,
    val image: Int?,
    val reviews: List<Review> = emptyList(),
    val isFavorite: Boolean = false
)