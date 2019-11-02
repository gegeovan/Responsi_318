package com.geovanywicaksono.responsi_318

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btn_masuk.setOnClickListener {
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Username and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (username == "gegeovan" || password == "318") {
                val intent = Intent(this, dashboard::class.java)
                startActivity(intent)
            }
        }

        btn_registrasi.setOnClickListener ( {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        })
    }
}
