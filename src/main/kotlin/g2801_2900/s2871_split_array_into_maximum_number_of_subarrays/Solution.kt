package g2801_2900.s2871_split_array_into_maximum_number_of_subarrays

// #Medium #Array #Greedy #Bit_Manipulation #2023_12_21_Time_490_ms_(100.00%)_Space_60.7_MB_(50.00%)

class Solution {
    fun maxSubarrays(nums: IntArray): Int {
        if (nums.size == 1) {
            return 1
        }
        var andMax = nums[0]
        var count = 0
        var currAnd = nums[0]
        var sum = 0
        for (n in nums) {
            andMax = andMax and n
        }
        for (i in 1 until nums.size) {
            val n = nums[i]
            if (currAnd <= andMax) {
                count++
                sum += currAnd
                currAnd = n
            }
            currAnd = currAnd and n
        }
        if (currAnd <= andMax) {
            count++
            sum += currAnd
        }
        return if (sum <= andMax) count else 1
    }
}
