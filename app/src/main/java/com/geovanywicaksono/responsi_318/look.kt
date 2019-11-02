package com.geovanywicaksono.responsi_318

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.look.*

class look : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.look)

        val intent = intent
        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        var password2 = intent.getStringExtra("Password")
        val address = intent.getStringExtra("Address")
        val birthdate = intent.getStringExtra("Birth Date")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text =
            "Nama : " + nama + "\nEmail: " + email + "\nPassword: " + password2 + "\nAlamat : " + address + "\nTanggal Lahir :" + birthdate

        pindahlogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }

}
