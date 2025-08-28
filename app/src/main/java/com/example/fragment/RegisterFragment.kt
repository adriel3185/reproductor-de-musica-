package com.example.beat_fetch.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.beat_fetch.MainActivity
import com.example.beat_fetch.R

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegister = view.findViewById<Button>(R.id.btnRegister)
        val tvLogin = view.findViewById<TextView>(R.id.tvLogin)

        btnRegister.setOnClickListener {
            // Aquí iría la lógica de registro
            (activity as MainActivity).replaceFragment(HomeFragment())
        }

        tvLogin.setOnClickListener {
            (activity as MainActivity).replaceFragment(LoginFragment())
        }
    }
}

