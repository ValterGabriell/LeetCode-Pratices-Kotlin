package leetcode.DesignParkingSystem

class ParkingSystem(private var big: Int, private var medium: Int, private var small: Int) {
    fun addCar(carType: Int): Boolean {
        return checkAndSubtractSlot(carType)
    }

    private fun checkAndSubtractSlot(carType: Int): Boolean {
        return when (carType) {
            CAR_TYPE_BIG -> big-- > 0
            CAR_TYPE_MEDIUM -> medium-- > 0
            CAR_TYPE_SMALL -> small-- > 0
            else -> false
        }
    }
    companion object {
        private const val CAR_TYPE_BIG = 1
        private const val CAR_TYPE_MEDIUM = 2
        private const val CAR_TYPE_SMALL = 3
    }
}