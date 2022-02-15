package br.senai.sp.jandira.imc

import java.text.DecimalFormat

 fun classificarImc(imc: Double): String {

    val decimalFormat = DecimalFormat("#.##")

    if(imc < 18.5){
        return "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está abaixo do peso!"
    }else if(imc < 25){
        return "Seu IMC é " +decimalFormat.format(imc) +"," + " e você está com o peso ideal! Parabéns!"
    }else if(imc < 30){
        return "Seu IMC é " +decimalFormat.format(imc) +"," + " e você está levemente acima do peso!"
    }else if(imc < 35){
        return "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau I!"
    }else if(imc < 40){
        return "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau II!"
    }else{
        return "Seu IMC é " +decimalFormat.format(imc) +"," +" e você está com obesidade grau III! Cuidado!"
    }

 }

 fun calcularImc(weight: Double, height: Double): Double {
    return weight / (height*height)
 }

