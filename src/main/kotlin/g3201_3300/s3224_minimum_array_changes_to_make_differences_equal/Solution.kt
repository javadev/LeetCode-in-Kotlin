package g3201_3300.s3224_minimum_array_changes_to_make_differences_equal

// #Medium #Array #Hash_Table #Prefix_Sum #2024_07_23_Time_665_ms_(84.62%)_Space_69.3_MB_(53.85%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minChanges(nums: IntArray, k: Int): Int {
        val cm = IntArray(k + 2)
        for (i in 0 until nums.size / 2) {
            val a = min(nums[i], nums[nums.size - 1 - i])
            val b = max(nums[i], nums[nums.size - 1 - i])
            val d = b - a
            if (d > 0) {
                cm[0]++
                cm[d]--
                cm[d + 1]++
                val max = (max(a, (k - b)) + d)
                cm[max + 1]++
            } else {
                cm[1]++
                val max = max(a, (k - a))
                cm[max + 1]++
            }
        }
        var sum = cm[0]
        var res = cm[0]
        for (i in 1..k) {
            sum += cm[i]
            res = min(res, sum)
        }
        return res
    }
}
