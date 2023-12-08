package com.example.a07ex01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edTexto = findViewById<EditText>(R.id.edTexto)
        val btnCriar = findViewById<Button>(R.id.btnCriar)

        btnCriar.setOnClickListener {
            val texto = edTexto.text.toString()
            mostraSnackbar(it, texto)

        }
    }
    fun mostraSnackbar(view: View, text: String) {
        var s = Snackbar.make(view, text, Snackbar.LENGTH_INDEFINITE)
        s.setAction("Fechar", { s.dismiss() })
        s.show()
    }
}