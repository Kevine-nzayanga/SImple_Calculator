package com.example.a3rdmay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   lateinit var etfirstvalue:EditText
    lateinit var etsecondvalue:EditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmultiply:Button
    lateinit var btnmodulus:Button
    lateinit var tvanswer:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validatecalc()

    }

    fun castviews(){
        etfirstvalue=findViewById(R.id.etfirstvalue)
        etsecondvalue=findViewById(R.id.etsecondvalue)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmultiply=findViewById(R.id.btnmultiply)
        btnmodulus=findViewById(R.id.btnmodulus)
        tvanswer=findViewById(R.id.tvanswer)
    }
    fun validatecalc(){
        castviews()

        btnadd!!.setOnClickListener {
            val result= etfirstvalue.text.toString().toDouble()!!+etsecondvalue.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btnsubtract.setOnClickListener {
            val result= etfirstvalue.text.toString().toDouble()!!-etsecondvalue.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btnmultiply.setOnClickListener {
            val result= etfirstvalue.text.toString().toDouble()!! * etsecondvalue.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }
        btnmodulus.setOnClickListener {
            val result= etfirstvalue.text.toString().toDouble()!! % etsecondvalue.text.toString().toDouble()!!
            tvanswer.text=result.toString()
        }


    }
}