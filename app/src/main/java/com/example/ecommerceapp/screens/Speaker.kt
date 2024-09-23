package com.example.ecommerceapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.ecommerceapp.viewModel.ElectronicsViewModel
import com.example.ecommerceapp.viewModel.Men_Women_ViewModel

@Composable
fun Speaker(navController: NavController) {
    val electronicsViewModel: ElectronicsViewModel = hiltViewModel()
    val datalist=electronicsViewModel.datalist.collectAsState()
    val screenName="Speaker"
    electronicsViewModel.getData("Accessories","Speaker")
    item2(datalist,screenName,navController)
}