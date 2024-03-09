package es.viu.segundaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SegundoActivity : AppCompatActivity() {
    private val TAG = "SgundoActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)

        Log.i(TAG, "--- ${TAG} creada por primera vez")

        //Recuperamos los extras a partir del actual Activity
        //https://developer.android.com/reference/android/os/Bundle
        val paquete:Bundle? = intent.extras
        val textoenviado:String? = paquete?.getString("texto") ?: "Sin texto enviado"

        //Colocamos en recurso
        val texto:TextView = findViewById(R.id.texto03)
        texto.text = textoenviado

    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "--- ${TAG} visible")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "--- ${TAG} disponible para interactuar")
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "--- ${TAG} pausada")
    }

    override fun onStop() {
        super.onStop()

        Log.i(TAG, "--- ${TAG} parada")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "--- ${TAG} destruida")
    }
}