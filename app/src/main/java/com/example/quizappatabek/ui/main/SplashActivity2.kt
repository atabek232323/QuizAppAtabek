package com.example.quizappatabek.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.quizappatabek.*
import com.example.quizappatabek.databinding.ActivitySplash2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        val botNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.main_LightFragment,R.id.history_Fragment,R.id.settings_Fragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
        botNav.setupWithNavController(navController)
        val person = Person()
        val kuzByrak = KuzByrak(person)
        val insturment = Insturment()
        val musik  =Musik(insturment,kuzByrak)
        musik.getMusic()

    }
}