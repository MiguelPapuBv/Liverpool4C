package com.example.liverpool_miguel.viewmodel

import androidx.lifecycle.ViewModel
import com.example.liverpool_miguel.model.Review

class ComentarioViewModel : ViewModel() {

    val comentariosDior = listOf(
        Review("Luis M.", "Huele riquísimo, dura todo el día.", 5),
        Review("Carlos G.", "Buen aroma pero un poco caro.", 4),
        Review("Jorge", "Me gustó bastante, lo recomiendo.", 5),
        Review("Andrés", "Llegó rápido y bien empaquetado.", 4)
    )

    val comentariosNintendo = listOf(
        Review("Miguel C.", "Excelente consola, colores increíbles.", 5),
        Review("Ana S.", "Perfecta para jugar en familia.", 5),
        Review("Pedro", "Muy buena, pero los controles son pequeños.", 4),
        Review("David", "La caja venía golpeada pero funciona bien.", 2)
    )

    val comentariosNike = listOf(
        Review("Sofia T.", "Super cómodos para correr.", 5),
        Review("Juan P.", "La talla viene exacta, gran diseño.", 5),
        Review("Elena", "Ligeros y combinan con todo.", 5),
        Review("Mario", "Excelente calidad de materiales.", 5)
    )

    val comentariosIphone = listOf(
        Review("Raul", "La cámara es increíble.", 5),
        Review("Diana", "La batería dura todo el día.", 4),
        Review("Omar", "Muy rápido, vale la pena.", 5),
        Review("Lucia", "Es bueno, pero no cambia mucho del anterior.", 4),
        Review("Fer", "Me encantó el color titanio.", 5)
    )

    val comentariosTv = listOf(
        Review("Hugo", "Buena imagen, sonido decente.", 4),
        Review("Paco", "El control remoto falló al mes.", 2),
        Review("Luis", "Fácil de instalar.", 4),
        Review("Gaby", "Se ve muy bien en la sala.", 4)
    )

    val comentariosDell = listOf(
        Review("Karla", "Muy rápida para programar.", 5),
        Review("Alex", "Se calienta un poco con juegos pesados.", 4),
        Review("Beto", "Pantalla con mucho brillo, genial.", 5),
        Review("Sara", "Ligera y fácil de transportar.", 5)
    )
}