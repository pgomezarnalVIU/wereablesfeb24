package es.viu.canalesyoutube.views

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.R
import es.viu.canalesyoutube.models.Canal
import es.viu.canalesyoutube.models.modelYoutube.YoutubeResponseItem

class CanalesViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val txtCanal: TextView =view.findViewById(R.id.txtCanal)

    fun render(canal: YoutubeResponseItem){
        txtCanal.text = canal.nombre
    }

}