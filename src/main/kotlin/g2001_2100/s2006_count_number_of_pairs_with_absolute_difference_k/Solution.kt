package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k

// #Easy #Array #Hash_Table #Counting
class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var pairs = 0
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    pairs++
                }
            }
        }
        return pairs
    }
}
