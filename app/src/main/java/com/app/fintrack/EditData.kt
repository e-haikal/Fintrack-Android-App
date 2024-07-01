package com.app.fintrack

import PemasukanFragment
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentContainerView
import java.text.SimpleDateFormat
import java.util.*

class EditData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)

        // Initialize views
        val tanggalEditText: EditText = findViewById(R.id.tanggalEditText)
        val pilihTanggalImageView: ImageView = findViewById(R.id.pilihTanggalImageView)

        // Calendar instance
        val calendar = Calendar.getInstance()

        // Date formatter
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

        // Set initial text on tanggalEditText
        tanggalEditText.setText(dateFormat.format(calendar.time))

        // Date picker dialog listener
        val dateSetListener = DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, monthOfYear)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            tanggalEditText.setText(dateFormat.format(calendar.time))
        }

        // Set click listener on image view to show date picker dialog
        pilihTanggalImageView.setOnClickListener {
            DatePickerDialog(
                this,
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        // Fragment initialization and button click listeners
        val pemasukanButton: Button = findViewById(R.id.pemasukanButton)
        val pengeluaranButton: Button = findViewById(R.id.pengeluaranButton)
        val fc_konten: FragmentContainerView = findViewById(R.id.fc_konten)
        val tahitiColor = ContextCompat.getColor(this, R.color.tahiti_gold)
        val dustyGreyColor = ContextCompat.getColor(this, R.color.dusty_grey)

        pemasukanButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(tahitiColor)
            pengeluaranButton.setBackgroundColor(dustyGreyColor)
            supportFragmentManager.beginTransaction().replace(fc_konten.id, PemasukanFragment()).commit()
        }

        pengeluaranButton.setOnClickListener {
            pemasukanButton.setBackgroundColor(dustyGreyColor)
            pengeluaranButton.setBackgroundColor(tahitiColor)
            supportFragmentManager.beginTransaction().replace(fc_konten.id, PengeluaranFragment()).commit()
        }
    }
}
