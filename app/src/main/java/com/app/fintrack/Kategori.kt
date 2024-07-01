package com.app.fintrack

import PemasukanFragment
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView

class Kategori : AppCompatActivity() {
    private lateinit var pemasukanButton: Button
    private lateinit var pengeluaranButton: Button
    private lateinit var fc_konten: FragmentContainerView
    private val tahitiColor by lazy { ContextCompat.getColor(this, R.color.tahiti_gold) }
    private val dustyGreyColor by lazy { ContextCompat.getColor(this, R.color.dusty_grey) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kategori)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        pemasukanButton = findViewById(R.id.pemasukanButton)
        pengeluaranButton = findViewById(R.id.pengeluaranButton)
        fc_konten = findViewById(R.id.fc_konten)

        // Initial fragment setup
        if (savedInstanceState == null) {
            setCurrentFragment(PemasukanFragment())
            pemasukanButton.setBackgroundColor(tahitiColor)
            pengeluaranButton.setBackgroundColor(dustyGreyColor)
        }

        // Set up button listeners
        pemasukanButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(tahitiColor)
            pengeluaranButton.setBackgroundColor(dustyGreyColor)
            setCurrentFragment(PemasukanFragment())
        }

        pengeluaranButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(dustyGreyColor)
            pengeluaranButton.setBackgroundColor(tahitiColor)
            setCurrentFragment(PengeluaranFragment())
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(fc_konten.id, fragment).commit()
    }
}
