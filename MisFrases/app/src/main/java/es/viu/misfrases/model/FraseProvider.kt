package es.viu.misfrases.model

class FraseProvider {
    companion object {

        //Devuelve una frase aleatoria dentro de la lista
        fun dameFrase(): FraseModel {
            val posicion = (0..(frases.size - 1)).random()
            return frases[posicion]
        }

        val frases = listOf<FraseModel>(
            FraseModel(
                "De vez en cuando, una nueva tecnología, un antiguo problema y una gran idea se convierten en una innovación",
                "Dean Kamen"
            ),
            FraseModel(
                "Las grandes oportunidades nacen de haber sabido aprovechar las pequeñas",
                "Bill Gates"
            ),
            FraseModel(
                "Si decides hacer solo las cosas que sabes que van a funcionar, dejarás un montón de oportunidades encima de la mesa",
                "Jeff Bezos"
            ),
            FraseModel(
                "La conectividad es un derecho humano",
                "Mark Zuckerberg"
            ),
            FraseModel(
                "El mundo se puede cambiar en 140 caracteres",
                "Jack Dorsey"
            ),
            FraseModel(
                "La tecnología no es nada. Lo importante es que tengas fe en la gente, que sean básicamente buenas e inteligentes, y si les das herramientas, harán cosas maravillosas con ellas",
                "Steve Jobs"
            ),
            FraseModel(
                "La ciencia de hoy es la tecnología del mañana",
                "Edward Teller"
            ),
            FraseModel(
                "El verdadero peligro no es que las computadoras comenzaran a pensar como los hombres, sino que los hombres comenzaran a pensar como las computadoras",
                "Sydney J. Harris"
            )
        )
    }
}