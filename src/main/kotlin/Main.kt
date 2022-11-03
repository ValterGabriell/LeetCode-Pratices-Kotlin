import Agiota.CalculandoValorAluguel
import Calculadora.Calculate
import Calculadora.NumerosPrimos
import Fatorial.Fatorial
import FormatString.FormatString
import Funcionario.Funcionario

fun main(args: Array<String>) {
    numeroPrimo()
}


private fun numeroPrimo(){
    val numerosPrimos = NumerosPrimos()
    numerosPrimos.numeroPrimo(4)
}

private fun funcionario(){
    val funcionario = Funcionario()
    funcionario.makeItWork()
}

private fun calculadora() {
    val calculate = Calculate()
    //1 -> soma
    //2 -> subtracao
    //3 -> divisao
    //4 -> multiplicacao
    val result = calculate.setOperator(1, 4, 3)
    println("O resultado e: $result")
}

private fun fatorial() {
    val fatorial = Fatorial()
    val result = fatorial.makeFatorialWithRecursividade(5)
    println("O resultado sem fatorial e: $result")
}

private fun formatString() {
    val format = FormatString()
    val primeiraFuncao = format.formatString("Carlos.albert0")
    val segundaFuncao = format.removingCharacter("Sherlock221b@", '2')
    println(segundaFuncao)
}

private fun aluguelAgiota() {
    val aluguel = CalculandoValorAluguel()
    val result = aluguel.calculandoValorAluguel(valorAlguel = 1680.0, diasAtraso = 18)
    println(result)
}