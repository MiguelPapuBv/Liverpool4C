package com.example.liverpool_miguel.model

data class Review(
    val nombreUsuario: String,
    val comentario: String,
    val estrellas: Int // Aquí está tu variable para calificar las estrellitas (ej. 4 o 5)
)