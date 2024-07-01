package com.app.fintrack

import PemasukanFragment
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import java.text.SimpleDateFormat
import java.util.*

class EditData : AppCompatActivity() {
    private lateinit var pemasukanButton: Button
    private lateinit var pengeluaranButton: Button
    private lateinit var fc_konten: FragmentContainerView
    private val tahitiColor by lazy { ContextCompat.getColor(this, R.color.tahiti_gold) }
    private val dustyGreyColor by lazy { ContextCompat.getColor(this, R.color.dusty_grey) }

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

        // Fragment initialization and initial fragment transaction
        fc_konten = findViewById(R.id.fc_konten)
        pemasukanButton = findViewById(R.id.pemasukanButton)
        pengeluaranButton = findViewById(R.id.pengeluaranButton)

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
