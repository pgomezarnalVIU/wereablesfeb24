package es.viu.canalesyoutube.service

import es.viu.canalesyoutube.models.CanalResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiYoutubeService {
    @GET
    suspend fun getCanalesYoutube(@Url url:String): Response<CanalResponse>
}