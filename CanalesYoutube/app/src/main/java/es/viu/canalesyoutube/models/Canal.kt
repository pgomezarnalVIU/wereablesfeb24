package es.viu.canalesyoutube.models

enum class CategoriasCanales {
    TECNOLOGIA,  COCINA, EDUCACION, CINE, OTROS
}

data class Canal (var nombre:String, var categoria:CategoriasCanales, var isSelected:Boolean=false)