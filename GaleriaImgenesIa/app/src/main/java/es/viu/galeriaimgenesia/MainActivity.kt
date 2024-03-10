package es.viu.galeriaimgenesia

import android.content.Intent
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
        IMAGENES.add(findViewById(R.id.imagen06))

        //Añadirmos el evento
        for(image:ImageView in IMAGENES){
            image.setOnClickListener({
                Log.i(TAG, "imagen ${image.tag} apretado")
                val intent = Intent(this,ImagenGrande::class.java)
                intent.putExtra("imagenRes",image.tag.toString())
                startActivity(intent)
            })
        }
    }

}

