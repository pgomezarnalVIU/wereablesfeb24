package es.viu.canalesyoutube.views

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import es.viu.canalesyoutube.R
import es.viu.canalesyoutube.models.CategoriasCanales


class CategoriaViewHolder(view: View) : RecyclerView.ViewHolder (view) {

    private val txtNombreCategoria:TextView =view.findViewById(R.id.txtNombreCategoria)
    private val divider: View = view.findViewById(R.id.divider)

    fun render(categoria: CategoriasCanales){
        when(categoria){
            CategoriasCanales.TECNOLOGIA -> {
                txtNombreCategoria.text="TECNOLOGÍA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
            CategoriasCanales.COCINA -> {
                txtNombreCategoria.text="COCINA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_cooking_category))
            }
            CategoriasCanales.CINE -> {
                txtNombreCategoria.text="CINE"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_other_category))
            }
            CategoriasCanales.OTROS -> {
                txtNombreCategoria.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
            else -> {
                txtNombreCategoria.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
        }
    }
}