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
        val transportasiIcon: ImageView = findViewById(R.id.transportasiIcon)
        val gajiIcon: ImageView = findViewById(R.id.gajiIcon)
        val sewaIcon: ImageView = findViewById(R.id.sewaIcon)
        val belanjaIcon: ImageView = findViewById(R.id.belanjaIcon)
        val minumanIcon: ImageView = findViewById(R.id.minumanIcon)
        val makananIcon: ImageView = findViewById(R.id.makananIcon)
        val hadiahIcon: ImageView = findViewById(R.id.hadiahIcon)
        val listrikIcon: ImageView = findViewById(R.id.listrikIcon)

        // Atur OnClickListener untuk setiap ImageView dalam daftar ikon
        transportasiIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.transportasi_icon) // Ganti dengan resource yang sesuai
        }

        gajiIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.gaji_icon) // Ganti dengan resource yang sesuai
        }

        sewaIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.sewa_icon) // Ganti dengan resource yang sesuai
        }

        belanjaIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.belanja_icon) // Ganti dengan resource yang sesuai
        }

        minumanIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.minuman_icon) // Ganti dengan resource yang sesuai
        }

        makananIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.makanan_icon) // Ganti dengan resource yang sesuai
        }

        hadiahIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.hadiah_icon) // Ganti dengan resource yang sesuai
        }

        listrikIcon.setOnClickListener {
            selectedIcon.setImageResource(R.drawable.listrik_icon) // Ganti dengan resource yang sesuai
        }
    }
}
