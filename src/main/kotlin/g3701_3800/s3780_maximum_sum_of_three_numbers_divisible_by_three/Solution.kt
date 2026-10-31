package g3701_3800.s3780_maximum_sum_of_three_numbers_divisible_by_three

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Senior #Biweekly_Contest_172
// #2026_05_06_Time_7_ms_(98.17%)_Space_168.14_MB_(89.91%)

import kotlin.math.max

class Solution {
    fun maximumSum(nums: IntArray): Int {
        val group: Array<IntArray> = Array<IntArray>(3) { IntArray(3) }
        for (num in nums) {
            val m = num % 3
            var max1 = group[m][0]
            var max2 = group[m][1]
            var max3 = group[m][2]
            if (num >= max1) {
                max3 = max2
                max2 = max1
                max1 = num
            } else if (num >= max2) {
                max3 = max2
                max2 = num
            } else if (num > max3) {
                max3 = num
            }
            group[m][0] = max1
            group[m][1] = max2
            group[m][2] = max3
        }
        var res = 0
        for (g in group) {
            var sum = 0
            var i = 0
            while (i < 3) {
                if (g[i] == 0) {
                    sum = 0
                    break
                }
                sum += g[i]
                i += 1
            }
            res = max(res, sum)
        }
        var max = 0
        for (g in group) {
            if (g[0] == 0) {
                max = 0
                break
            }
            max += g[0]
        }
        res = max(res, max)
        return res
    }
}
