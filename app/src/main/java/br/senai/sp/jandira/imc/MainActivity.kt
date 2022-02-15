package br.senai.sp.jandira.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

private lateinit var weightEditText: EditText
private lateinit var heightEditText: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.ButtonCalcular)

        calcular.setOnClickListener(){

            weightEditText = findViewById(R.id.weight)
            heightEditText = findViewById(R.id.height)

            if (validarCampos()){

                val weight = weightEditText.text.toString().toDouble()
                val height = heightEditText.text.toString().toDouble()
                //val imc = weight / (height*height)
                val resultado = findViewById<TextView>(R.id.results)

                val imc = calcularImc(weight, height)

                resultado.text = classificarImc(imc)

            }

        }
    }

    fun validarCampos(): Boolean {

        var noError = true;

        if (weightEditText.text.isBlank()) {
            weightEditText.setError("Digite a Nota 1")
            noError = false
        }
        if (heightEditText.text.isBlank()){
            heightEditText.setError("Digite a Nota 2")
            noError = false
        }

        return noError;

    }
}


