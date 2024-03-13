package es.viu.canalesyoutube.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.R
import es.viu.canalesyoutube.models.CategoriasCanales
import es.viu.canalesyoutube.views.CategoriaViewHolder

class CategoriasAdapter(private val categorias:List<CategoriasCanales>) : RecyclerView.Adapter<CategoriaViewHolder>() {

    //Aquí se decide qué se pinta en cada vista CategoriaViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categoria,parent,false)
        return CategoriaViewHolder(view)
    }

    //Número de elementos totales
    override fun getItemCount(): Int {
        return categorias.size
    }

    //Aquí directamente se renderiza
    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        holder.render(categorias[position])
    }
}