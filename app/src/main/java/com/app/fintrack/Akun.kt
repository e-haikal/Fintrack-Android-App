package com.app.fintrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Akun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_akun)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //mengaktifkan  akun menu
        val faqMenu: TextView = findViewById(R.id.faqMenu)
        faqMenu.setOnClickListener {
            val pindah = Intent(this, Faq::class.java)
            startActivity(pindah)
        }

        //mengaktifkan  tentang menu
        val tentangMenu: TextView = findViewById(R.id.tentangMenu)
        tentangMenu.setOnClickListener {
            val pindah = Intent(this, Tentang::class.java)
            startActivity(pindah)
        }

        //mengaktifkan  privasi menu
        val privasiMenu: TextView = findViewById(R.id.privasiMenu)
        privasiMenu.setOnClickListener {
            val pindah = Intent(this, Privasi::class.java)
            startActivity(pindah)
        }

        //mengaktifkan  akun menu
        val ketentuanMenu: TextView = findViewById(R.id.ketentuanMenu)
        ketentuanMenu.setOnClickListener {
            val pindah = Intent(this, Ketentuan::class.java)
            startActivity(pindah)
        }

        //mengaktifkan  logout button
        val logoutButton: TextView = findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener {
            val pindah = Intent(this, Login1::class.java)
            startActivity(pindah)
            finish()
        }




    }
}