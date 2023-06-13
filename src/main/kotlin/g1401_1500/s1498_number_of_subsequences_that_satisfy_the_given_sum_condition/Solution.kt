package g1401_1500.s1498_number_of_subsequences_that_satisfy_the_given_sum_condition

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Binary_Search_II_Day_15
// #2023_06_13_Time_487_ms_(97.89%)_Space_52.4_MB_(100.00%)

class Solution {
    fun numSubseq(nums: IntArray, target: Int): Int {
        // sorted array will be used to perform binary search
        nums.sort()
        val mod = 1000000007
        // powOf2[i] means (2^i) % mod
        val powOf2 = IntArray(nums.size)
        powOf2[0] = 1
        for (i in 1 until nums.size) {
            powOf2[i] = powOf2[i - 1] * 2 % mod
        }
        var res = 0
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                // nums[right] which is macimum is too big so decrease it
                right--
            } else {
                // every number between right and left be either picked or not picked
                // so that is why pow(2, right - left) essentially
                res = (res + powOf2[right - left]) % mod
                // increment left to find next set of min and max
                left++
            }
        }
        return res
    }
}
