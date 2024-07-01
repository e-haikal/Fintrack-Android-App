package com.app.fintrack

import PemasukanFragment
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentContainerView

class TambahData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tambah_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Kode item fragment start
        val pemasukanButton: Button = findViewById(R.id.pemasukanButton)
        val pengeluaranButton: Button = findViewById(R.id.pengeluaranButton)
        val fc_konten: FragmentContainerView = findViewById(R.id.fc_konten)
        val tahitiColor = ContextCompat.getColor(this, R.color.tahiti_gold)
        val dustyGreyColor = ContextCompat.getColor(this, R.color.dusty_grey)
        pemasukanButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(tahitiColor)
            pengeluaranButton.setBackgroundColor(dustyGreyColor)
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(fc_konten.id, PemasukanFragment())
            ft.commit()
        }
        pengeluaranButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(dustyGreyColor)
            pengeluaranButton.setBackgroundColor(tahitiColor)
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(fc_konten.id, PengeluaranFragment())
            ft.commit()
        }
//        Kode item fragment end
    }
}