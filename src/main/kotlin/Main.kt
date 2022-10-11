import Calculadora.Calculate
import Fatorial.Fatorial
import FormatString.FormatString

fun main(args: Array<String>) {
    println(args.joinToString())
    formatString()
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

private fun formatString(){
    val format = FormatString()
    println(format.formatString("Carlos.albert0"))
}