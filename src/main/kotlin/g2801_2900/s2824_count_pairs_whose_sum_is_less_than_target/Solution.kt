package g2801_2900.s2824_count_pairs_whose_sum_is_less_than_target

// #Easy #Array #Sorting #Two_Pointers
class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var cnt = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] < target) {
                    cnt++
                }
            }
        }
        return cnt
    }
}
