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

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_daftar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val daftarButton: Button = findViewById(R.id.daftarButton)
        daftarButton.setOnClickListener {
            val pindah: Intent = Intent(this, Login1::class.java)
            startActivity(pindah)
            finish()
            Toast.makeText(this, "Buat Akun Berhasil", Toast.LENGTH_LONG).show()
        }


        //mengaktifkan tombol back di navbar atas
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val pindah = Intent(this, Login::class.java)
            startActivity(pindah)
        }
    }
}