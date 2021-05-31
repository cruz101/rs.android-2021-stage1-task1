package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = ArrayList<Int>()
        for (i in sadArray.indices) {
            happyArray.add(sadArray[i])
        }

        return happyArray(happyArray)
    }

    fun happyArray(happyArray: ArrayList<Int>): IntArray {
        var cnt = 0
        var x = 0
        for (j in 0 until happyArray.size - 2) {
            if (happyArray[j + 1] >= happyArray[j] + happyArray[j + 2]) {
                x = happyArray[j + 1]
                cnt += 1
                break
            }
        }
        for (i in happyArray.indices) {
            if (x == happyArray[i]) {
                happyArray.removeAt(i)
                break
            }
        }
        return if (cnt == 0) {
            return happyArray.toIntArray()
        } else happyArray(happyArray)
    }
}
