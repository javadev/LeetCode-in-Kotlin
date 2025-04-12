package g3001_3100.s3074_apple_redistribution_into_boxes

// #Easy #Array #Sorting #Greedy #2024_04_16_Time_168_ms_(97.37%)_Space_35.4_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        val count = IntArray(51)
        var appleSum = 0
        for (j in apple) {
            appleSum += j
        }
        var reqCapacity = 0
        var max = 0
        for (j in capacity) {
            count[j]++
            max = max(max, j)
        }
        for (i in max downTo 0) {
            if (count[i] >= 1) {
                while (count[i] != 0) {
                    appleSum -= i
                    reqCapacity++
                    if (appleSum <= 0) {
                        return reqCapacity
                    }
                    count[i]--
                }
            }
        }
        return reqCapacity
    }
}
