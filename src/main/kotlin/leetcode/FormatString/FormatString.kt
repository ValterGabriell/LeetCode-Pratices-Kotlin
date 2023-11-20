package leetcode.FormatString

class FormatString {

    fun formatString(str: String): String {
        //contando tamanho
        val stringWitoutSpaces = str.replace("\\s".toRegex(), "")
        val lenghtOfStringCharacters = stringWitoutSpaces.length


        val charArray = str.toCharArray()
        //verificando quantos numeros tem
        var arrayWithDigits = arrayListOf<Char>()
        charArray.map {
            if (it.isDigit()) {
                arrayWithDigits.add(it)
            }
        }

        val arrayVogais = listOf("a", "e", "i", "o", "u")
        var arrayWithVogais = arrayListOf<Char>()
        //verificando vogais
        charArray.map {
            if (arrayVogais.contains(it.toString())) {
                arrayWithVogais.add(it)
            }
        }

        //verificando pontuacao
        val arrayPontuacao = listOf(".", ",")
        var arrayWithPontuacao = arrayListOf<Char>()
        charArray.map {
            if (arrayPontuacao.contains(it.toString())) {
                arrayWithPontuacao.add(it)
            }
        }


        val stringFinal =
            "A frase $str tem tamanho de $lenghtOfStringCharacters. Com ${arrayWithDigits.size} numeros, ${arrayWithVogais.size} vogais e ${arrayWithPontuacao.size} pontos"


        return stringFinal
    }

    fun removingCharacter(str: String, valueToBeRemoved: Any?): String {

        val charArray = str.toCharArray()
        val newString = arrayListOf<Char>()
        charArray.map {
            if (it != valueToBeRemoved) {
                newString.add(it)
            }
        }

        return String(newString.toCharArray())

    }


}