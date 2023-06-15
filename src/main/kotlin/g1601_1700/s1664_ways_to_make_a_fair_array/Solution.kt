package g1601_1700.s1664_ways_to_make_a_fair_array

// #Medium #Array #Dynamic_Programming #2023_06_15_Time_475_ms_(100.00%)_Space_49.7_MB_(100.00%)

class Solution {
    fun waysToMakeFair(nums: IntArray): Int {
        var res = 0
        val even = IntArray(nums.size)
        val odd = IntArray(nums.size)
        var oddSum = 0
        var evenSum = 0
        for (i in nums.indices) {
            if (i % 2 == 0) {
                evenSum += nums[i]
            } else {
                oddSum += nums[i]
            }
            even[i] = evenSum
            odd[i] = oddSum
        }
        for (i in nums.indices) {
            if (i == 0) {
                evenSum = odd[nums.size - 1] - odd[0]
                oddSum = even[nums.size - 1] - even[0]
            } else {
                oddSum = odd[i - 1] + even[nums.size - 1] - even[i]
                evenSum = even[i - 1] + odd[nums.size - 1] - odd[i]
            }
            if (evenSum == oddSum) {
                res++
            }
        }
        return res
    }
}
