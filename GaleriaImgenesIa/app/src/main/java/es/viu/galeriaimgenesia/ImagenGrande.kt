package es.viu.galeriaimgenesia

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class ImagenGrande : AppCompatActivity() {
    private val TAG = "ImagenGrande"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen_grande)

        //Recuperamos los extras a partir del actual Activity
        //https://developer.android.com/reference/android/os/Bundle
        val paquete: Bundle? = intent.extras
        val imagenRes: String = paquete?.getString("imagenRes") ?: "@drawable/imagen03.jpg"
        Log.i(TAG, "imagen ${imagenRes} recibido")
        val imageResource:Int = getResources().getIdentifier(imagenRes, null, getPackageName())

        //Colocamos la imagen
        val imagengrande: ImageView = findViewById(R.id.imagengrande)
        val res:Drawable = getResources().getDrawable(imageResource);
        imagengrande.setImageDrawable(res)
    }
}