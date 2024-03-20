package es.viu.misfrases.model.modelFraseFireStore

data class Document(
    val createTime: String,
    val fields: Fields,
    val name: String,
    val updateTime: String
)