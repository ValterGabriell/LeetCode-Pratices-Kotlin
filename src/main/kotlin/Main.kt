import leetcode.DesignParkingSystem.ParkingSystem


fun main(args: Array<String>) {
  parkingExercise()
}

fun parkingExercise(){
    val obj = ParkingSystem(1, 1, 0)
    obj.addCar(1)
    obj.addCar(2)
    obj.addCar(3)
    obj.addCar(1)
}