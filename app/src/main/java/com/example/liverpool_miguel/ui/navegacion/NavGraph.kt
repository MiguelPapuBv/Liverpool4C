package com.example.liverpool_miguel.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.liverpool_miguel.ui.screens.DetalleProductos
import com.example.liverpool_miguel.ui.screens.ListaProductos
import com.example.liverpool_miguel.viewmodel.ComentarioViewModel
import com.example.liverpool_miguel.viewmodel.ProductoViewModel
import mx.edu.utez.MiguelChavez.ui.screens.liverpool.InicioScreen

// Definición de las rutas idéntica a la plantilla de tu profesor
sealed class Route(val path: String) {
    object Inicio : Route("inicio")
    object Productos : Route("productos")
    object Detalles : Route("detalles")
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Inicio.path,
        modifier = modifier
    ) {
        // 1. Pantalla de Inicio
        composable(Route.Inicio.path) {
            InicioScreen(
                onNavigateToList = { navController.navigate(Route.Productos.path) }
            )
        }

        // 2. Pantalla Lista de Productos
        composable(Route.Productos.path) {
            ListaProductos(
                ProductoViewModel(),
                navController
            )
        }

        // 3. Pantalla Detalles de Producto
        composable(Route.Detalles.path) {
            DetalleProductos(
                ProductoViewModel(),
                ComentarioViewModel(),
                navController
            )
        }
    }
}