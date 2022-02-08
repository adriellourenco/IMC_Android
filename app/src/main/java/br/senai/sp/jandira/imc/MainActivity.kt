package br.senai.sp.jandira.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.ButtonCalcular)
        val decimalFormat = DecimalFormat("#.##")

        calcular.setOnClickListener(){
            val weight = findViewById<EditText>(R.id.weight).text.toString().toDouble()
            val height = findViewById<EditText>(R.id.height).text.toString().toDouble()
            val imc = weight / (height*height)
            val resultado = findViewById<TextView>(R.id.results)

            if(imc < 18.5){
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está abaixo do peso!"
            }else if(imc < 25){
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," + " e você está com o peso ideal! Parabéns!"
            }else if(imc < 30){
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," + " e você está levemente acima do peso!"
            }else if(imc < 35){
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau I!"
            }else if(imc < 40){
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau II!"
            }else{
                resultado.text = "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau III! Cuidado!"
            }


        }
    }
}