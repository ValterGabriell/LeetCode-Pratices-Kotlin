package leetcode.FormatString.Palindole

class IMyInterfaceImpl : IMyInterface {
    override fun isPalidrome(str: String): Boolean {
        var newStr = str.toLowerCase()
        var charArray = newStr.toCharArray()
        var palavraAgin = arrayListOf<Char>()
        for ((index, _) in charArray.withIndex()) {
            val lastIndex = charArray.size-index-1
            palavraAgin.add(charArray[lastIndex])
        }
        return newStr == String(palavraAgin.toCharArray())
    }
}