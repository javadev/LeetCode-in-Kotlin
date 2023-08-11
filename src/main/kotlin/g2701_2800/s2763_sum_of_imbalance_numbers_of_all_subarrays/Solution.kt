package g2701_2800.s2763_sum_of_imbalance_numbers_of_all_subarrays

// #Hard #Array #Hash_Table #Ordered_Set #2023_08_11_Time_417_ms_(95.24%)_Space_40.2_MB_(95.24%)

class Solution {
    fun sumImbalanceNumbers(nums: IntArray): Int {
        val n = nums.size
        var ans = 0
        for (i in 0 until n) {
            val s: MutableSet<Int> = HashSet()
            var curr = 0
            for (j in i until n) {
                val x = nums[j]
                if (s.contains(x)) {
                    // do nothing
                } else if (s.contains(x - 1) && s.contains(x + 1)) {
                    curr--
                } else if (!s.contains(x - 1) && !s.contains(x + 1) && s.isNotEmpty()) {
                    curr++
                }
                s.add(x)
                ans += curr
            }
        }
        return ans
    }
}
