package com.geovanywicaksono.responsi_318

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        btn_daftar.setOnClickListener{
            val email = findViewById<EditText>(R.id.email)
            val password = findViewById<EditText>(R.id.edt_password2)
            if (email.text.isEmpty() || edt_password2.text.isEmpty()) {
                Toast.makeText(this, "Username/Password Harus Diisi", Toast.LENGTH_SHORT).show()
            }
            if (edt_password2.text.isNotEmpty() && password.text.isNotEmpty()) {
                val intent = Intent(this, look::class.java)
                startActivity(intent)
            }
        }

        btn_daftar.setOnClickListener {
            val nama = edt_nama.text.toString()
            val email = email.text.toString()
            val password = edt_password2.text.toString()
            val address = edt_address.text.toString()
            val birthdate = edt_birthdate.text.toString()

            val intent = Intent(this@register, look::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Username", email)
            intent.putExtra("Password", password)
            intent.putExtra("Alamat", address)
            intent.putExtra("Tanggal Lahir", birthdate)
            startActivity(intent)

        }
    }
}