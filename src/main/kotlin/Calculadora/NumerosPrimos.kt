package Calculadora

class NumerosPrimos {

    fun numeroPrimo(x: Int) {
        if (x > 0) {
            if (x == 2){
                println("O numero e primo")
            }else if (x % 2 == 0){
                println("O numero n e primo")
            }else{
                println("O numero e primo")
            }
        } else {
            println("O numero não pode ser primo pois ou é 0 ou é menor que zero")
        }
    }

}