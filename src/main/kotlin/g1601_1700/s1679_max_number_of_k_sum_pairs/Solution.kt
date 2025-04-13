package g1601_1700.s1679_max_number_of_k_sum_pairs

// #Medium #Array #Hash_Table #Sorting #Two_Pointers #LeetCode_75_Two_Pointers
// #2023_06_15_Time_468_ms_(92.86%)_Space_50.5_MB_(92.86%)

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var start = 0
        var end = nums.size - 1
        var count = 0
        while (start < end) {
            val sum = nums[start] + nums[end]
            if (sum == k) {
                count++
                start++
                end--
            } else if (sum < k) {
                start++
            } else {
                end--
            }
        }
        return count
    }
}
