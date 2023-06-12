package g1501_1600.s1512_number_of_good_pairs

// #Easy #Array #Hash_Table #Math #Counting #2023_06_12_Time_138_ms_(70.65%)_Space_33.9_MB_(69.57%)

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j]) {
                    count++
                }
            }
        }
        return count
    }
}
