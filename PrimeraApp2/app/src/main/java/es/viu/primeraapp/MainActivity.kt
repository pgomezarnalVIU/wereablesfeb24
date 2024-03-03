package es.viu.primeraapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperamos el texto en el diseño
        Log.i(TAG, "Comienza nuestra aplicación")
        val primerText: TextView = findViewById(R.id.texto)
        primerText.text = "Cambio del texto que aparece en el widget"
        Log.i(TAG, "Ccargada aplicación")

        //Recuperamos el botón del diseño
        val boton : Button = findViewById(R.id.boton)
        boton.setOnClickListener({
            Log.i(TAG, "BOTON APRETADO")
        })
    }
}