package es.viu.canalesyoutube.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.R
import es.viu.canalesyoutube.models.Canal
import es.viu.canalesyoutube.models.modelYoutube.YoutubeResponseItem
import es.viu.canalesyoutube.views.CanalesViewHolder

class CanalesAdapter (private val canales: List<YoutubeResponseItem>): RecyclerView.Adapter<CanalesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CanalesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_canal,parent,false)
        return CanalesViewHolder(view)
    }

    override fun getItemCount() = canales.size

    override fun onBindViewHolder(holder: CanalesViewHolder, position: Int) {
        holder.render(canales[position])
    }
}