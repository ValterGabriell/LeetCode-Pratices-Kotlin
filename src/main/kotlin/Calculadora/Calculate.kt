package Calculadora

class Calculate : Operations() {
    fun setOperator(operator: Int, x: Int, y: Int): Int {
        when (operator) {
            1 -> {
                return sum(x, y)
            }
            2 -> {
                return sub(x, y)
            }

            3 -> {
                return div(x, y)
            }

            4 -> {
                return mult(x, y)
            }
        }
        return 0
    }
}