package com.sifatasif101.ktcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var result: EditText
    private lateinit var textField: EditText
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE) { findViewById<TextView>(R.id.operation) }

    private var operand1: Double? = null
    private var operand2: Double = 0.0
    private var pendingOperation = "="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        result=findViewById(R.id.result)
        textField=findViewById(R.id.textField)

        val bu0:Button = findViewById(R.id.bu0)
        val bu1:Button = findViewById(R.id.bu1)
        val bu2:Button = findViewById(R.id.bu2)
        val bu3:Button = findViewById(R.id.bu3)
        val bu4:Button = findViewById(R.id.bu4)
        val bu5:Button = findViewById(R.id.bu5)
        val bu6:Button = findViewById(R.id.bu6)
        val bu7:Button = findViewById(R.id.bu7)
        val bu8:Button = findViewById(R.id.bu8)
        val bu9:Button = findViewById(R.id.bu9)
        val buDot:Button = findViewById(R.id.buDot)

        val buMul:Button = findViewById(R.id.buMul)
        val buDiv:Button = findViewById(R.id.buDiv)
        val buAdd:Button = findViewById(R.id.buAdd)
        val buSub:Button = findViewById(R.id.buSub)
        val buEqual:Button = findViewById(R.id.buEqual)

        val listener = View.OnClickListener { v ->
            val b = v as Button
            textField.append(b.text)
        }
        bu0.setOnClickListener(listener)
        bu1.setOnClickListener(listener)
        bu2.setOnClickListener(listener)
        bu3.setOnClickListener(listener)
        bu4.setOnClickListener(listener)
        bu5.setOnClickListener(listener)
        bu6.setOnClickListener(listener)
        bu7.setOnClickListener(listener)
        bu8.setOnClickListener(listener)
        bu9.setOnClickListener(listener)
        buDot.setOnClickListener(listener)

        val opListener = View.OnClickListener { v->
            val op = (v as Button).text.toString()
            val value = textField.text.toString()
            if (value.isNotEmpty()){
                performOperation(value,op)
            }
            pendingOperation= op
            displayOperation.text=pendingOperation
        }
        buEqual.setOnClickListener(opListener)
        buAdd.setOnClickListener(opListener)
        buSub.setOnClickListener(opListener)
        buMul.setOnClickListener(opListener)
        buDiv.setOnClickListener(opListener)
    }
    private fun performOperation(value:String, operation:String){
        if(operand1==null){
            operand1=value.toDouble()
        }else{
            operand2= value.toDouble()
            if (pendingOperation=="="){
                pendingOperation=operation
            }
            when(pendingOperation){
                "=" -> operand1=operand2
                "/" -> if(operand2==0.0){
                    operand1 =Double.NaN
                }else{
                    operand1=(operand1!!) / (operand2)
                }
                "*"->operand1=operand1!! * operand2
                "-"->operand1=operand1!! - operand2
                "+"->operand1=operand1!! + operand2
            }
        }
        result.setText(operand1.toString())
        textField.setText("")
    }

}