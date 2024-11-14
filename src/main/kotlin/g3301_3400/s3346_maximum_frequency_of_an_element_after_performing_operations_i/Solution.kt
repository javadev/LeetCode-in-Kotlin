package g3301_3400.s3346_maximum_frequency_of_an_element_after_performing_operations_i

// #Medium #Array #Sorting #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_11_14_Time_12_ms_(100.00%)_Space_64.1_MB_(80.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun getMax(nums: IntArray): Int {
        var max = nums[0]
        for (num in nums) {
            max = max(num, max)
        }
        return max
    }

    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        val maxNum = getMax(nums)
        val n = maxNum + k + 2
        val freq = IntArray(n)
        for (num in nums) {
            freq[num]++
        }
        val pref = IntArray(n)
        pref[0] = freq[0]
        for (i in 1 until n) {
            pref[i] = pref[i - 1] + freq[i]
        }
        var res = 0
        for (i in 0 until n) {
            val left: Int = max(0, (i - k))
            val right: Int = min((n - 1), (i + k))
            var tot = pref[right]
            if (left > 0) {
                tot -= pref[left - 1]
            }
            res = max(res, (freq[i] + min(numOperations, (tot - freq[i]))))
        }
        return res
    }
}
