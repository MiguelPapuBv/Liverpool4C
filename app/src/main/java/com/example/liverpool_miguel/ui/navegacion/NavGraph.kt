package com.example.liverpool_miguel.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.liverpool_miguel.ui.screens.DetalleProductos
import com.example.liverpool_miguel.ui.screens.ListaProductos
import com.example.liverpool_miguel.viewmodel.ProductoViewModel
import mx.edu.utez.MiguelChavez.ui.screens.liverpool.InicioScreen

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
    val productoViewModel: ProductoViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Route.Inicio.path,
        modifier = modifier
    ) {
        composable(Route.Inicio.path) {
            InicioScreen(
                onNavigateToList = { navController.navigate(Route.Productos.path) }
            )
        }

        composable(Route.Productos.path) {
            ListaProductos(
                productoViewModel = productoViewModel,
                navController = navController
            )
        }

        composable(Route.Detalles.path) {
            DetalleProductos(
                productoViewModel = productoViewModel,
                navController = navController
            )
        }
    }
}