package nullable

//n tem herança
data class Biblioteca(
    val id: Long,
    val name: String
) {
    fun doSomething(value: String?) {
        val result = value ?: "Valor nulo"
        println(result)
    }

    fun doSmtg(value:Int){
        println(value)
    }
}