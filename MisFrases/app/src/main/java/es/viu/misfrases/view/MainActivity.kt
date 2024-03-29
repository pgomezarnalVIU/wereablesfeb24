package es.viu.misfrases.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import es.viu.misfrases.R
import es.viu.misfrases.model.FraseModel
import es.viu.misfrases.model.FraseProvider
import es.viu.misfrases.model.modelFraseFireStore.FraseResponse
import es.viu.misfrases.service.ApiFrasesService
import es.viu.misfrases.service.RetrofitServiceFactory
import es.viu.misfrases.viewmodel.FraseViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    //by viewModels va a permitir enganchar directamente todo el ciclo de vida
    //de un activity sin tener que extender o programarlo
    private val fraseViewModel: FraseViewModel by viewModels()

    private lateinit var tvAutor:TextView
    private lateinit var tvFrase:TextView
    private lateinit var viewContainer:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAutor=findViewById(R.id.tvAutor)
        tvFrase=findViewById(R.id.tvFrase)
        viewContainer=findViewById(R.id.viewContainer)

        //Añadimos el listener
        viewContainer.setOnClickListener{
            //Cambiamos la frase
            //Notificará que ha cambiado a través del observer
            fraseViewModel.randomFrase()
        }

        //En este punto añadimos la observacion del cambio de datos con --> observe
        //El segundo parámetro es el que nos permite realizar modificaciones del contenido del view
        fraseViewModel.fraseData.observe(this, Observer {
            tvFrase.text= it.frase
            tvAutor.text= it.autor
        })

        //Montamos el servicio para lanzar la petición contra el API
        val apiFrasesService = RetrofitServiceFactory.getFrasesRetrofit()

        lifecycleScope.launch {
            val frasesResponse:FraseResponse = apiFrasesService.getFrases("misfrases")
            //Relleno los datos del FraseProvider
            FraseProvider.frasesWeb =  FraseProvider.fraseResponseAdapter(frasesResponse)
            Log.i("MAINACTIVITY",FraseProvider.frasesWeb[0].autor)
        }
    }
}