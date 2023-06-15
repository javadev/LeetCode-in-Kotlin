package g1601_1700.s1673_find_the_most_competitive_subsequence

// #Medium #Array #Greedy #Stack #Monotonic_Stack
// #2023_06_15_Time_741_ms_(100.00%)_Space_57_MB_(100.00%)

class Solution {
    fun mostCompetitive(nums: IntArray, k: Int): IntArray {
        val r = IntArray(k)
        val n = nums.size
        var j = 0
        for (i in 0 until n) {
            if (i == 0) {
                r[j] = nums[i]
                j++
            } else {
                var l = j - 1
                while (l >= 0 && nums[i] < r[l] && n - i >= k - l) {
                    l--
                }
                j = l + 1
                if (j < k) {
                    r[j] = nums[i]
                    j++
                }
            }
        }
        return r
    }
}
