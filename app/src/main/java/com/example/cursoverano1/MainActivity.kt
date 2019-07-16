package com.example.cursoverano1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pes: Int=0
    var alt: Double=0.0
    var imc: Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularIMC(v: View){
        if(etPeso.text.isEmpty()){
            Toast.makeText(this,"Falta el peso en kilogramaos",Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        }else if(etAltura.text.isEmpty()){
            Toast.makeText(this,"Falta la altura en metros",Toast.LENGTH_LONG).show()
            etAltura.requestFocus()
        }
        else{
            pes = etPeso.text.toString().toInt()
            alt = etAltura.text.toString().toDouble()
            imc= pes/(alt*alt)
            when {
                imc<25 -> Toast.makeText(this,"Tu IMC es el Adecuado, tu IMC es: $imc",Toast.LENGTH_LONG).show()
                imc>=25 && imc<30 -> Toast.makeText(this,"Tu IMC es de sobre pes, tu IMC es: $imc\" ",Toast.LENGTH_LONG).show()
                imc>=30 -> Toast.makeText(this,"Tu IMC es de obesidad, tu IMC es: $imc\"",Toast.LENGTH_LONG).show()
            }
        }
    }
}
