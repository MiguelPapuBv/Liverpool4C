package com.example.liverpool_miguel.viewmodel

import androidx.lifecycle.ViewModel
import com.example.liverpool_miguel.model.ProductDetail

class ProductoViewModel : ViewModel() {

    private val comentarios = ComentarioViewModel()

    val listaProductos: List<ProductDetail> = listOf(
        ProductDetail(
            id = "1",
            brand = "Dior",
            name = "Sauvage Eau de Parfum",
            price = 3450.00,
            rating = 4.5f,
            reviewCount = 4, 
            isFreeShipping = true,
            description = "Un perfume con notas frescas y amaderadas, ideal para cualquier ocasión.",
            image = null,
            reviews = comentarios.comentariosDior
        ),
        ProductDetail(
            id = "2",
            brand = "Nintendo",
            name = "Consola Nintendo Switch OLED",
            price = 6500.00,
            rating = 4.0f,
            reviewCount = 4, 
            isFreeShipping = true,
            description = "Disfruta de tus juegos favoritos con una pantalla OLED vibrante de 7 pulgadas.",
            image = null,
            reviews = comentarios.comentariosNintendo
        ),
        ProductDetail(
            id = "3",
            brand = "Nike",
            name = "Tenis Air Max 270",
            price = 2999.00,
            rating = 5.0f,
            reviewCount = 4, 
            isFreeShipping = true,
            description = "Comodidad extrema con la cápsula de aire más grande para uso diario.",
            image = null,
            reviews = comentarios.comentariosNike
        ),
        ProductDetail(
            id = "4",
            brand = "Apple",
            name = "iPhone 15 Pro 256GB",
            price = 23999.00,
            rating = 4.6f,
            reviewCount = 5, 
            isFreeShipping = true,
            description = "Diseño de titanio, chip A17 Pro y un sistema de cámaras superpotente.",
            image = null,
            reviews = comentarios.comentariosIphone
        ),
        ProductDetail(
            id = "5",
            brand = "Samsung",
            name = "Pantalla 55 Pulgadas 4K UHD",
            price = 8500.00,
            rating = 3.5f,
            reviewCount = 4, 
            isFreeShipping = true,
            description = "Colores vivos y procesador Crystal 4K para una experiencia inmersiva.",
            image = null,
            reviews = comentarios.comentariosTv
        ),
        ProductDetail(
            id = "6",
            brand = "Dell",
            name = "Laptop XPS 13 Plus",
            price = 32000.00,
            rating = 4.75f,
            reviewCount = 4, 
            isFreeShipping = true,
            description = "Rendimiento premium en un diseño ultradelgado con pantalla táctil 4K.",
            image = null,
            reviews = comentarios.comentariosDell
        )
    )

    fun obtenerProductoPorId(id: String): ProductDetail? {
        return listaProductos.find { it.id == id }
    }
}