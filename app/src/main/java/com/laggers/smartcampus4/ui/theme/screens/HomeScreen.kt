package com.laggers.smartcampus4.ui.theme.screens

import android.annotation.SuppressLint
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview






@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun HomePage(modifier: Modifier = Modifier){

    Scaffold (
        bottomBar = {
            NavigationBar {

            }
        }
    ){

    }


}