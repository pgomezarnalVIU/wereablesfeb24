package es.viu.misfrases.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import es.viu.misfrases.model.FraseModel
import es.viu.misfrases.model.FraseProvider

class FraseViewModel:ViewModel() {

    //Permitirá que este modelo se enganche a datos y que se avise del cambio
    val fraseData = MutableLiveData<FraseModel>()

    fun randomFrase(){
        val fraseActual :FraseModel = FraseProvider.dameFrase()
        //Esta función avisará que hay un cambio en los datos del ViewModel
        fraseData.postValue(fraseActual)
    }
}