package Funcionario

class Funcionario {

    fun makeItWork() {

        var nameInput = "Gabriel"
        var horaWorkedInput = 190
        var numDep = 2
        var salario = 23 * horaWorkedInput.toInt()
        val adicionalDep = 34 * numDep.toInt()
        val salarioTotal = salario + adicionalDep
        var descontoINSS = (salarioTotal * 8.5) / 100
        var descontoIR = (salarioTotal * 15) / 100
        var salarioComDesconto = salario + adicionalDep - descontoINSS - descontoIR

        println("O trabalhador $nameInput trabalha $horaWorkedInput horas por semana, com $numDep dependentes. Ele recebe no total, $salarioTotal reais, devido ao adicional de $adicionalDep que ele possui. " +
                "Porem, com o desconto do INSS que é de $descontoINSS e o desconto do IR que é de $descontoIR ele acaba recebendo só $salarioComDesconto")


    }


}