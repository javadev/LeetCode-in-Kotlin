package g3901_4000.s3940_limit_occurrences_in_sorted_array

// #Easy #Array #Two_Pointers #Mid_Level #Weekly_Contest_503
// #2026_09_29_Time_1_ms_(100.00%)_Space_46.77_MB_(68.82%)

class Solution {
    fun limitOccurrences(nums: IntArray, k: Int): IntArray {
        val ls: MutableList<Int?> = ArrayList<Int?>()
        ls.add(nums[0])
        var freq = 1
        for (i in 1..<nums.size) {
            if (nums[i] == nums[i - 1]) {
                freq++
            } else {
                freq = 1
            }
            if (freq <= k) {
                ls.add(nums[i])
            }
        }
        val ans = IntArray(ls.size)
        for (i in ls.indices) {
            ans[i] = ls[i]!!
        }
        return ans
    }
}
