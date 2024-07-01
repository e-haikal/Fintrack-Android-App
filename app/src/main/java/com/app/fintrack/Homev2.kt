package com.app.fintrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homev2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homev2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //mengaktifkan tombol laporan
        val laporanbutton: Button = findViewById(R.id.laporanButton)
        laporanbutton.setOnClickListener {
            val pindah = Intent(this, Laporan::class.java)
            startActivity(pindah)
        }

        //mengaktifkan tombol akun
        val akunButton: Button = findViewById(R.id.akunButton)
        akunButton.setOnClickListener {
            val pindah = Intent(this, Akun::class.java)
            startActivity(pindah)
        }

        //mengaktifkan tombol login
        val tambahDataButton: Button = findViewById(R.id.tambahDataButton)
        tambahDataButton.setOnClickListener {
            val pindah = Intent(this, TambahData::class.java)
            startActivity(pindah)
        }

        //mengaktifkan tombol login
        val editDataButton: Button = findViewById(R.id.editDataButton)
        editDataButton.setOnClickListener {
            val pindah = Intent(this, EditData::class.java)
            startActivity(pindah)
        }

        //mengaktifkan tombol login
        val homeButton: Button = findViewById(R.id.homeButton)
        homeButton.setOnClickListener {
            val pindah = Intent(this, HomeActivity::class.java)
            startActivity(pindah)
        }
    }
}