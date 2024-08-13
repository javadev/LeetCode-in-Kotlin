package g3201_3300.s3250_find_the_count_of_monotonic_pairs_i

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Combinatorics
// #2024_08_13_Time_3_ms_(100.00%)_Space_44.7_MB_(99.34%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun countOfPairs(nums: IntArray): Int {
        val maxShift = IntArray(nums.size)
        maxShift[0] = nums[0]
        var currShift = 0
        for (i in 1 until nums.size) {
            currShift = max(currShift, (nums[i] - maxShift[i - 1]))
            maxShift[i] = min(maxShift[i - 1], (nums[i] - currShift))
            if (maxShift[i] < 0) {
                return 0
            }
        }
        val cases = getAllCases(nums, maxShift)
        return cases[nums.size - 1]!![maxShift[nums.size - 1]]
    }

    private fun getAllCases(nums: IntArray, maxShift: IntArray): Array<IntArray?> {
        var currCases: IntArray
        val cases = arrayOfNulls<IntArray>(nums.size)
        cases[0] = IntArray(maxShift[0] + 1)
        for (i in cases[0]!!.indices) {
            cases[0]!![i] = i + 1
        }
        for (i in 1 until nums.size) {
            currCases = IntArray(maxShift[i] + 1)
            currCases[0] = 1
            for (j in 1 until currCases.size) {
                val prevCases =
                    if (j < cases[i - 1]!!.size
                    ) cases[i - 1]!![j]
                    else cases[i - 1]!![cases[i - 1]!!.size - 1]
                currCases[j] = (currCases[j - 1] + prevCases) % (1000000000 + 7)
            }
            cases[i] = currCases
        }
        return cases
    }
}
