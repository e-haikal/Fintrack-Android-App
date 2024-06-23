package com.app.fintrack

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lupaPasswordText: TextView = findViewById(R.id.lupaPasswordText)
        lupaPasswordText.setOnClickListener {
            val pindah = Intent(this, UbahPassword::class.java)
            startActivity(pindah)
        }


        //Buat teks daftar di sini bisa diklik
        val registerTextView: TextView = findViewById(R.id.registerText2)
        val text = "Belum punya akun? Daftar di sini"
        val spannableString = SpannableString(text)

        val clickablespan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val pindah = Intent(this@Login1, Daftar::class.java)
                startActivity(pindah)
            }
        }

        spannableString.setSpan(clickablespan, 17, text.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        registerTextView.text = spannableString
        registerTextView.movementMethod = LinkMovementMethod.getInstance()

        //mengaktifkan tombol back di navbar atas
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val pindah = Intent(this, Login::class.java)
            startActivity(pindah)
        }

        //mengaktifkan tombol login
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            val pindah = Intent(this, HomeActivity::class.java)
            startActivity(pindah)
        }
    }
}