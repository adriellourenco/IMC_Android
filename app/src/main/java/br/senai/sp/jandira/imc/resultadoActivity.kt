package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class resultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val imcTextView = findViewById<TextView>(R.id.resultadoImc)
        val estadoTextView = findViewById<TextView>(R.id.resultadoEstado)

        val intent : Intent = getIntent()
        val actionBar = supportActionBar

        actionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        imcTextView.text = intent.getStringExtra("imc")
        estadoTextView.text = intent.getStringExtra("estado")

    }
}