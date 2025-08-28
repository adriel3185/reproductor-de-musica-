package com.example.beat_fetch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.beat_fetch.fragments.WelcomeFragment
import com.example.beat_fetch.fragments.LoginFragment
import com.example.beat_fetch.fragments.RegisterFragment
import com.example.beat_fetch.fragments.HomeFragment
import com.example.beat_fetch.fragments.DiscoveryFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Para testing, puedes cambiar el fragmento inicial aquí:
        // WelcomeFragment() - Pantalla de bienvenida
        // LoginFragment() - Pantalla de login
        // RegisterFragment() - Pantalla de registro
        // HomeFragment() - Pantalla principal
        // DiscoveryFragment() - Pantalla de géneros

        if (savedInstanceState == null) {
            replaceFragment(WelcomeFragment())
        }
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun navigateToHome() {
        replaceFragment(HomeFragment())
    }

    fun navigateToDiscovery() {
        replaceFragment(DiscoveryFragment())
    }
}