package HackerHank

class AliceAndBob {
    fun compareTriplets(a: ArrayList<Int>, b: ArrayList<Int>): ArrayList<Int> {
        var alicePoints = 0
        var bobPoints = 0
        var arrayResult = ArrayList<Int>()

        a.mapIndexed { indexA, valueA ->
            b.mapIndexed {indexB, valueB ->
                if (indexA == indexB){
                    if(valueA > valueB){
                        alicePoints++
                    }else if (valueA < valueB){
                        bobPoints++
                    }
                }
            }
        }



        arrayResult.add(alicePoints)
        arrayResult.add(bobPoints)
        return arrayResult
    }


}