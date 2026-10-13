package com.example.liverpool_miguel.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.liverpool_miguel.ui.screens.DetallesProductoScreen
import com.example.liverpool_miguel.ui.screens.InicioScreen
import com.example.liverpool_miguel.ui.screens.ListaProductosScreen
import com.example.liverpool_miguel.viewmodel.ProductoViewModel

sealed class Route(val path: String) {
    object Inicio : Route("inicio")
    object Productos : Route("productos")
    object Detalles : Route("detalles/{productoId}") {
        fun createRoute(productoId: String) = "detalles/$productoId"
    }
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    productoViewModel: ProductoViewModel = viewModel()
) {
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
            ListaProductosScreen(
                productos = productoViewModel.listaProductos,
                onBack = { navController.popBackStack() },
                onProductClick = { id -> 
                    navController.navigate(Route.Detalles.createRoute(id)) 
                }
            )
        }

        composable(Route.Detalles.path) { backStackEntry ->
            val productoId = backStackEntry.arguments?.getString("productoId")
            val producto = productoId?.let { productoViewModel.obtenerProductoPorId(it) }
            
            if (producto != null) {
                DetallesProductoScreen(
                    producto = producto,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}