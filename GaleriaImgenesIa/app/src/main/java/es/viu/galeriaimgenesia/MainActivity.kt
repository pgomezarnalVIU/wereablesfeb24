package es.viu.galeriaimgenesia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(){

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recogemos todas las imagenes pequeñas
        val IMAGENES= arrayListOf<ImageView>()
        IMAGENES.add(findViewById(R.id.imagen01))
        IMAGENES.add(findViewById(R.id.imagen02))
        IMAGENES.add(findViewById(R.id.imagen03))
        IMAGENES.add(findViewById(R.id.imagen04))
        IMAGENES.add(findViewById(R.id.imagen05))
        //Excluimos la sexta imagen ya que abritá OpenArt
        val openart:ImageView = findViewById(R.id.imagen06)

        //Añadirmos el evento
        for(image:ImageView in IMAGENES){
            image.setOnClickListener({
                Log.i(TAG, "imagen ${it.tag} apretado")
                val intent = Intent(this,ImagenGrande::class.java)
                intent.putExtra("imagenRes",it.tag.toString())
                startActivity(intent)
            })
        }
        //Añadimos el evento de la sexta imagen
        openart.setOnClickListener({
            Log.i(TAG, "imagen ${it.tag} apretado")
            val queryUrl: Uri = Uri.parse("https://openart.ai/discovery")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)
        })
    }

}

