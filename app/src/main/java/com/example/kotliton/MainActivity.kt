package com.example.kotliton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            tvresultado.setText(sumar())

        }


    }

    private fun sumar() :String{
        if (!et1.text.isEmpty() && !et2.text.isEmpty()) {
            var  suma =et1.text.toString().toInt() +
                    et2.text.toString().toInt()
            return "la suma es :${suma} je "


        }
        else{

            return "ingrese numero"
        }



    }




}
