package es.viu.misfrases

import android.util.Log
import androidx.lifecycle.lifecycleScope
import es.viu.misfrases.model.FraseModel
import es.viu.misfrases.model.FraseProvider
import es.viu.misfrases.model.modelFraseFireStore.Document
import es.viu.misfrases.model.modelFraseFireStore.FraseResponse
import es.viu.misfrases.service.ApiFrasesService
import es.viu.misfrases.service.RetrofitServiceFactory
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FraseProviderTest{
    //FraseModel
    lateinit var fraseAleatoria:FraseModel
    lateinit var fraseModels: MutableList<FraseModel>
    lateinit var apiFrasesService: ApiFrasesService

    @Before
    fun onBefore(){
        //Montamos el servicio para lanzar la petición contra el API
        apiFrasesService = RetrofitServiceFactory.getFrasesRetrofit()
    }

    @Test
    fun devuelveFraseModelRandom(){
        fraseAleatoria = FraseProvider.dameFrase()
        //Comprobaciones
        assertTrue(fraseAleatoria.frase.isNotEmpty())
        assertTrue(fraseAleatoria.autor.isNotEmpty())
    }

    @Test
    fun devuelveArrayFraseModelRandom(){
        val numFrases=5
        fraseModels= arrayListOf()

        for(i in 1..5){
            fraseModels.add(FraseProvider.dameFrase())
        }
        //Comprobaciones
        assertEquals(numFrases,fraseModels.size)

    }

    @Test
    fun devuelveFraseModelRandomWebSinDatosFireStore(){
        fraseAleatoria = FraseProvider.dameFraseWeb()
        //Comprobaciones
        assertTrue(fraseAleatoria.frase.isNotEmpty())
        assertTrue(fraseAleatoria.autor.isNotEmpty())
    }

    @Test
    fun devuelveFraseModelRandomWeb() = runBlocking {
        val frasesResponse:FraseResponse = apiFrasesService.getFrases("misfrases")
        //Relleno los datos del FraseProvider
        FraseProvider.frasesWeb =  FraseProvider.fraseResponseAdapter(frasesResponse)

        fraseAleatoria = FraseProvider.dameFraseWeb()
        //Comprobaciones
        assertTrue(fraseAleatoria.frase.isNotEmpty())
        assertTrue(fraseAleatoria.autor.isNotEmpty())
    }

}