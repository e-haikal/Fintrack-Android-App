package com.app.fintrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UbahPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ubah_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ubahPasswordButton: Button = findViewById(R.id.ubahPasswordButton)
        ubahPasswordButton.setOnClickListener {
            val pindah: Intent = Intent(this, Login1::class.java)
            startActivity(pindah)
            finish()
            Toast.makeText(this, "Password Berhasil Diubah", Toast.LENGTH_LONG).show()
        }


        //mengaktifkan tombol back di navbar atas
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val pindah = Intent(this, Login::class.java)
            startActivity(pindah)
        }
    }
}