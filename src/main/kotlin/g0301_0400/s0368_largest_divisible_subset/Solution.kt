package g0301_0400.s0368_largest_divisible_subset

import java.util.Arrays

// #Medium #Array #Dynamic_Programming #Math #Sorting
// #2022_11_19_Time_412_ms_(73.33%)_Space_40.8_MB_(80.00%)

class Solution {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val n = nums.size
        val count = IntArray(n)
        val pre = IntArray(n)
        Arrays.sort(nums)
        var max = 0
        var index = -1
        for (i in 0 until n) {
            count[i] = 1
            pre[i] = -1
            for (j in i - 1 downTo 0) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1
                        pre[i] = j
                    }
                }
            }
            if (count[i] > max) {
                max = count[i]
                index = i
            }
        }
        val res: MutableList<Int> = ArrayList()
        while (index != -1) {
            res.add(nums[index])
            index = pre[index]
        }
        return res
    }
}
