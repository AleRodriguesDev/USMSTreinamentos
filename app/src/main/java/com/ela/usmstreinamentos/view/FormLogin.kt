package com.ela.usmstreinamentos.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ela.usmstreinamentos.R
import com.ela.usmstreinamentos.databinding.ActivityFormLoginBinding

class FormLogin : AppCompatActivity() {

    private lateinit var binding: ActivityFormLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
        binding.btEntrar.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val senha = binding.editSenha.text.toString()

            when {
                email.isEmpty() -> {
                    binding.containerEmail.helperText = "Campo obrigatório"
                    binding.containerEmail.boxStrokeColor = getColor(R.color.red)
                }
                senha.isEmpty() -> {
                    binding.containerSenha.helperText = "Campo obrigatório"
                    binding.containerEmail.boxStrokeColor = getColor(R.color.red)
                }
            }
        }
    }
}