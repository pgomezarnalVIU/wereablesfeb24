package es.viu.segundaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        //Ojo que al ser una clase heredada hay que lanzar onCreate de AppCompatActivity
        super.onCreate(savedInstanceState)

        Log.i(TAG, "--- ${TAG} creada por primera vez")
        setContentView(R.layout.activity_main)

        //Capturar evento sobre View para lanzar segunda ventana
        val vista:View = findViewById(R.id.vista01)
        vista.setOnClickListener({
            Log.i(TAG, "VISTA01 Apretada")
            val intent = Intent(this,SegundoActivity::class.java)
            intent.putExtra("texto","VISTA01 Apretada")
            startActivity(intent)
        })
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