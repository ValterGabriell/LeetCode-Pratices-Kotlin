package FormatString.Palindole

class Palidolia(val impl: IMyInterfaceImpl) {


    fun iss(string: String) : Boolean{
        return impl.isPalidrome(string)
    }


}