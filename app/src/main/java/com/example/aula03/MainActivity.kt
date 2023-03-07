package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Infla o XML (pega ele e transforma em tela)
        setContentView(R.layout.activity_main)

        //Binding
        //1- findViewById
        // val = const  var = ach
        //forma alternativa de dizer o tipo
        val editValor1 = findViewById<EditText>(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val editResultado: EditText = findViewById(R.id.editResultado)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)

        //Eventos
        //Closure, fncao seta (arrow Function), listener

        buttonSomar.setOnClickListener{
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 + valor2

            editResultado.setText(resultado.toString())

            showDialog("Resultado: ", resultado.toString())
        }

        buttonSubtrair.setOnClickListener{
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 - valor2

            editResultado.setText(resultado.toString())

            showDialog("Resultado",resultado.toString())
        }

        buttonMultiplicar.setOnClickListener{
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 * valor2

            editResultado.setText(resultado.toString())

            showDialog("Resultado: ", resultado.toString())
        }

        buttonDividir.setOnClickListener{
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 / valor2

            editResultado.setText(resultado.toString())

            showDialog("Resultado: ", resultado.toString())
        }

    }

    fun showDialog(title: String, msg: String){
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}