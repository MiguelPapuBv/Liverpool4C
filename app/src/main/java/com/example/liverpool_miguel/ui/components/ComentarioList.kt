package com.example.liverpool_miguel.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.liverpool_miguel.model.Review

@Composable
fun ComentarioList(
    comentarios: List<Review>
) {
    Column {
        comentarios.forEach { review ->
            ComentarioCard(
                usuario = review.reviewerName,
                comentario = review.comment,
                calificacion = review.rating
            )
        }
    }
}