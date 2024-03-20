package es.viu.misfrases.service

import es.viu.misfrases.model.FraseModel
import es.viu.misfrases.model.modelFraseFireStore.FraseResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiFrasesService {
    @GET
    suspend fun getFrases(@Url url:String) : FraseResponse
}

object RetrofitServiceFactory {
    //Funcion que crea un objeto Retrofit(aliasYoutubeService) a partir de una URl + una factoría de conversión + la Interfaz de la petición
    fun getFrasesRetrofit(): ApiFrasesService {
        return Retrofit.Builder()
            .baseUrl("https://firestore.googleapis.com/v1/projects/misfrases-285cf/databases/(default)/documents/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiFrasesService::class.java)
    }
}