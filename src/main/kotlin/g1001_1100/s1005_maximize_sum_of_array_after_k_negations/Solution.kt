package g1001_1100.s1005_maximize_sum_of_array_after_k_negations

// #Easy #Array #Sorting #Greedy #2023_05_15_Time_167_ms_(100.00%)_Space_36.5_MB_(20.00%)

import java.util.Arrays

class Solution {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        var k = k
        Arrays.sort(nums)
        var minIndex = 0
        var i = 0
        while (i < nums.size && k > 0) {
            if (nums[i] < 0) {
                nums[i] *= -1
                k--
            }
            if (nums[minIndex] > nums[i]) {
                minIndex = i
            }
            i++
        }
        if (k and 1 == 1) {
            nums[minIndex] *= -1
        }
        return Arrays.stream(nums).sum()
    }
}
