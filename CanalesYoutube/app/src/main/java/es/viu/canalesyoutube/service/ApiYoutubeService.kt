package es.viu.canalesyoutube.service

import es.viu.canalesyoutube.models.modelYoutube.YoutubeResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiYoutubeService {
    @GET
    suspend fun getCanalesYoutube(@Url url:String) : YoutubeResponse

    //Una petición con parámetros en la query sería
/*
    @GET("www.api.es/api/v1")
    suspend fun getCanalesYoutubeQuery(
        @Path("limit") limit:Int,
        @Query("api_key") apikey:String,
        @Query("region") region:String
    )
*/
}

object RetrofitServiceFactory {
    //Funcion que crea un objeto Retrofit(aliasYoutubeService) a partir de una URl + una factoría de conversión + la Interfaz de la petición
    fun getCanalesRetrofit(): ApiYoutubeService {
        return Retrofit.Builder()
            .baseUrl("http://192.168.0.108:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiYoutubeService::class.java)
    }
}