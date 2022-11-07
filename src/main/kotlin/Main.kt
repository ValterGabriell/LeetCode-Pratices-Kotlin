import Agiota.CalculandoValorAluguel
import Calculadora.Calculate
import Calculadora.NumerosPrimos
import Fatorial.Fatorial
import FormatString.FormatString
import FormatString.Palindole.IMyInterfaceImpl
import FormatString.Palindole.Palidolia
import Funcionario.Funcionario

fun main(args: Array<String>) {
    val impl = IMyInterfaceImpl()
    val result = palidrome(impl, "neymar")
    if (result){
        println("A palavra eh palindrome")
    }else{
        println("A palavra nao eh palindrome")
    }
}

private fun palidrome(impl: IMyInterfaceImpl, str:String) : Boolean{
    val apn = Palidolia(impl)
    return apn.iss(str)
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