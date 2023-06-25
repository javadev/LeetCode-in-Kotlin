package g2101_2200.s2136_earliest_possible_day_of_full_bloom

// #Hard #Array #Sorting #Greedy #2023_06_25_Time_968_ms_(100.00%)_Space_57.2_MB_(100.00%)

import java.util.Arrays
import java.util.Collections

class Solution {
    fun earliestFullBloom(plantTime: IntArray, growTime: IntArray): Int {
        val n = plantTime.size
        if (n == 1) {
            return plantTime[0] + growTime[0]
        }
        val arr = arrayOfNulls<Seed>(n)
        for (i in 0 until n) {
            arr[i] = Seed(plantTime[i], growTime[i])
        }
        Arrays.sort(arr, Collections.reverseOrder())
        var ans = arr[0]!!.plantTime + arr[0]!!.growTime
        var lastPlantDay = arr[0]!!.plantTime
        for (i in 1 until n) {
            val currBloomDay = lastPlantDay + arr[i]!!.plantTime + arr[i]!!.growTime
            ans = Math.max(ans, currBloomDay)
            lastPlantDay += arr[i]!!.plantTime
        }
        return ans
    }

    internal class Seed(var plantTime: Int, var growTime: Int) : Comparable<Seed> {
        override fun compareTo(other: Seed): Int {
            return growTime - other.growTime
        }
    }
}
