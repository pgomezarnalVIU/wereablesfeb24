package es.viu.canalesyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.adapters.CanalesAdapter
import es.viu.canalesyoutube.adapters.CategoriasAdapter
import es.viu.canalesyoutube.models.CategoriasCanales
import es.viu.canalesyoutube.models.modelYoutube.YoutubeResponseItem
import es.viu.canalesyoutube.service.RetrofitServiceFactory
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    //Fake-data creamos los datos que vamos a mostrar
    private val categorias= listOf (
        CategoriasCanales.CINE,
        CategoriasCanales.TECNOLOGIA,
        CategoriasCanales.COCINA,
        CategoriasCanales.OTROS)
    private val canalesInit= mutableListOf<YoutubeResponseItem>()

    //Recycler categorias
    private lateinit var rvCategorias: RecyclerView
    private lateinit var categoriasAdapter: CategoriasAdapter

    //Recycler canales
    private lateinit var rvCanales:RecyclerView
    private lateinit var ccanalesAdapter: CanalesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buscamos e inicializamos los recyclers
        rvCategorias = findViewById(R.id.rvCategorias)
        rvCanales = findViewById(R.id.rvCanales)

        //Montamos el recycler de categorías
        categoriasAdapter = CategoriasAdapter(categorias)
        rvCategorias.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategorias.adapter = categoriasAdapter

        //Montamos el recycler de canales
        ccanalesAdapter = CanalesAdapter(canalesInit)
        rvCanales.layoutManager = LinearLayoutManager(this)
        rvCanales.adapter=ccanalesAdapter

        //Montamos el servicio para lanzar la petición contra el API
        val apiYoutubeService = RetrofitServiceFactory.getCanalesRetrofit()

        lifecycleScope.launch {
            val data = apiYoutubeService.getCanalesYoutube("canales")
            //Relleno los datos desde la respuesta
            val canalesData=data
            //Borro datos del RecyclerView
            canalesInit.clear()
            canalesInit.addAll(canalesData)
            //Repinta RecyclerView
            ccanalesAdapter.notifyDataSetChanged()
        }


    }
}