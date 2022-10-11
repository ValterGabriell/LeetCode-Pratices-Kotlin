package Fatorial

class Fatorial {

    fun makeFatorialWithRecursividade(num: Int): Long {
        return if(num==1) num.toLong()
        else num*makeFatorialWithRecursividade(num-1)

    }

}