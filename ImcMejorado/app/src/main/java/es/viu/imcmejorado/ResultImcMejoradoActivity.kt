package es.viu.imcmejorado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.DecimalFormat

class ResultImcMejoradoActivity : AppCompatActivity() {
    lateinit var btnReCalculate: Button
    lateinit var txtIMC: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc_mejorado)

        //Recogemos el valor
        val paquete: Bundle? = intent.extras
        val imc: Number = paquete?.getDouble("IMC") ?: 0f
        txtIMC =findViewById(R.id.txtIMC)
        val df = DecimalFormat("#.##")
        txtIMC.text = df.format(imc).toString()

        //Inicializar el boton
        btnReCalculate =findViewById(R.id.btnReCalculate)
        btnReCalculate.setOnClickListener { onBackPressedDispatcher.onBackPressed() } // Activity dentro de la pila, el anterior

    }
}