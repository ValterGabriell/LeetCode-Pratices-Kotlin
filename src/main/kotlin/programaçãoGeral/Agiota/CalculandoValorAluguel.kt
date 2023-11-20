package programaçãoGeral.Agiota

class CalculandoValorAluguel {

    fun calculandoValorAluguel(valorAlguel: Double, diasAtraso: Int): Double {
        val multa = porcento(qtdPorcento = 3, alguel = valorAlguel)
        val diaria = porcentoDiaria(dias = diasAtraso, qtdPorcento = 0.5, aluguel = valorAlguel)

        return formulaFinal(aluguel = valorAlguel, multa = multa, multaDia = diaria)

    }

    private fun formulaFinal(aluguel: Double, multa: Double, multaDia: Double) = aluguel + multa + multaDia
    private fun porcento(qtdPorcento: Int, alguel: Double) = (qtdPorcento / 100) * alguel
    private fun porcentoDiaria(dias: Int, qtdPorcento: Double, aluguel: Double) = dias * (qtdPorcento/100) * aluguel
}