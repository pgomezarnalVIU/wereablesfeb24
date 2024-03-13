package es.viu.canalesyoutube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.adapters.CanalesAdapter
import es.viu.canalesyoutube.adapters.CategoriasAdapter
import es.viu.canalesyoutube.models.Canal
import es.viu.canalesyoutube.models.CanalResponse
import es.viu.canalesyoutube.models.CategoriasCanales
import es.viu.canalesyoutube.service.ApiYoutubeService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    //Fake-data creamos los datos que vamos a mostrar
    private val categorias= listOf (
        CategoriasCanales.CINE,
        CategoriasCanales.TECNOLOGIA,
        CategoriasCanales.COCINA,
        CategoriasCanales.OTROS)
    private val canalesInit= mutableListOf<Canal>()

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
        //Montamos el recycler
        categoriasAdapter = CategoriasAdapter(categorias)
        rvCategorias.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategorias.adapter = categoriasAdapter

        //Montamos el recycler de canales
        ccanalesAdapter = CanalesAdapter(canalesInit)
        rvCanales.layoutManager = LinearLayoutManager(this)
        rvCanales.adapter=ccanalesAdapter

    }
    //Funcion de peticion contra APIResptFul
    private fun getCanalesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.0.108:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    private fun getCanales(){
        CoroutineScope(Dispatchers.IO).launch{
            val peticion = getCanalesRetrofit()
                .create(ApiYoutubeService::class.java)
                .getCanalesYoutube("data")
            val canalesResponse: CanalResponse? = peticion.body()
            runOnUiThread{
                if(peticion.isSuccessful){
                    Log.i("CANALESYOUTUBE","--------- EXITO")
                    //Relleno los datos desde la respuesta
                    val canalesData=canalesResponse?.canales?:emptyList()
                    //Borro datos del RecyclerView
                    canalesInit.clear()
                    canalesInit.addAll(canalesData)
                    //Repinta RecyclerView
                    ccanalesAdapter.notifyDataSetChanged()
                }else{
                    Log.i("CANALESYOUTUBE","--------- ERROR")
                }
            }
        }
    }
}