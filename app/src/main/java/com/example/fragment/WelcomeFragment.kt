package com.example.beat_fetch.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.beat_fetch.MainActivity
import com.example.beat_fetch.R

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegister = view.findViewById<Button>(R.id.btnRegister)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)

        btnRegister.setOnClickListener {
            (activity as MainActivity).replaceFragment(RegisterFragment())
        }

        btnLogin.setOnClickListener {
            (activity as MainActivity).replaceFragment(LoginFragment())
        }
    }
}

