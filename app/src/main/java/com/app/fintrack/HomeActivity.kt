package com.app.fintrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val tambahDataHome = findViewById<FloatingActionButton>(R.id.tambahDataHome)
        tambahDataHome.setOnClickListener {
            val pindah = Intent(this, TambahData::class.java)
            startActivity(pindah)
        }

        // Menetapkan listener untuk BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Navigasi ke halaman Home
                    // Navigasi ke halaman Akun
                    val pindah = Intent(this, HomeActivity::class.java)
                    startActivity(pindah)
                    true                }
                R.id.nav_category -> {
                    // Navigasi ke halaman Kategori
                    // Navigasi ke halaman Akun
                    val pindah = Intent(this, Kategori::class.java)
                    startActivity(pindah)
                    true                }
                R.id.nav_tambahdata -> { // sesuai dengan ID yang didefinisikan di bottom_nav.xml
                    val pindah = Intent(this, TambahData::class.java)
                    startActivity(pindah)
                    true
                }
                R.id.nav_laporan -> {
                    // Navigasi ke halaman Laporan
                    // Navigasi ke halaman Akun
                    val pindah = Intent(this, Laporan::class.java)
                    startActivity(pindah)
                    true                }
                R.id.nav_akun -> {
                    // Navigasi ke halaman Akun
                    val pindah = Intent(this, Akun::class.java)
                    startActivity(pindah)
                    true
                }
                else -> false
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
