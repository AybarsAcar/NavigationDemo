package com.aybarsacar.navdemoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

  private lateinit var _navController: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    // assign hte navigation fragment to the nav controller
    _navController = Navigation.findNavController(this@MainActivity, R.id.fragment)

    // add the back button
    NavigationUI.setupActionBarWithNavController(this, _navController)
  }

  override fun onSupportNavigateUp(): Boolean {
    return NavigationUI.navigateUp(_navController, null)
  }
}