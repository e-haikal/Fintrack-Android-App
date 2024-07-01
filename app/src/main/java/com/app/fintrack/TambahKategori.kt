package com.app.fintrack

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TambahKategori : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_kategori)

        // ImageView di form input
        val selectedIcon: ImageView = findViewById(R.id.selectedIcon)

        // ImageView dalam daftar ikon
        val iconMakanan: ImageView = findViewById(R.id.iconMakanan)
        val iconMinuman: ImageView = findViewById(R.id.iconMinuman)
        val iconPermainan: ImageView = findViewById(R.id.iconPermainan)
        val iconHadiah: ImageView = findViewById(R.id.iconHadiah)
        val iconBelanja: ImageView = findViewById(R.id.iconBelanja)
        val iconTransportasi: ImageView = findViewById(R.id.iconTransportasi)
        val iconBiayaListrik: ImageView = findViewById(R.id.iconBiayaListrik)
        val iconKategoriBaru: ImageView = findViewById(R.id.iconKategoriBaru)

        // Atur OnClickListener untuk setiap ImageView dalam daftar ikon
        iconMakanan.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconMinuman.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconPermainan.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconHadiah.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconBelanja.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconTransportasi.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconBiayaListrik.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.noimage) // Ganti dengan resource yang sesuai
        }

        iconKategoriBaru.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.fb_icon) // Ganti dengan resource yang sesuai
        }
    }
}
