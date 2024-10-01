package g3301_3400.s3301_maximize_the_total_height_of_unique_towers

// #Medium #Array #Sorting #Greedy #2024_10_01_Time_761_ms_(87.50%)_Space_68.1_MB_(77.50%)

class Solution {
    fun maximumTotalSum(maximumHeight: IntArray): Long {
        maximumHeight.sort()
        var result = maximumHeight[maximumHeight.size - 1].toLong()
        var previousHeight = maximumHeight[maximumHeight.size - 1].toLong()
        for (i in maximumHeight.size - 2 downTo 0) {
            if (previousHeight == 1L) {
                return -1
            }
            val height = maximumHeight[i].toLong()
            if (height >= previousHeight) {
                result = result + previousHeight - 1
                previousHeight = previousHeight - 1
            } else {
                result = result + height
                previousHeight = height
            }
        }
        return result
    }
}
