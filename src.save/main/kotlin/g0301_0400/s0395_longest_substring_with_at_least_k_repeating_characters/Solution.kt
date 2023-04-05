package g0301_0400.s0395_longest_substring_with_at_least_k_repeating_characters

// #Medium #Top_Interview_Questions #String #Hash_Table #Sliding_Window #Divide_and_Conquer
// #2022_11_28_Time_274_ms_(66.67%)_Space_34_MB_(100.00%)

class Solution {
    fun longestSubstring(s: String, k: Int): Int {
        return helper(s, k, 0, s.length)
    }

    private fun helper(s: String, k: Int, start: Int, end: Int): Int {
        if (end - start < k) {
            return 0
        }
        val nums = IntArray(26)
        for (i in start until end) {
            nums[s[i].code - 'a'.code]++
        }
        for (i in start until end) {
            if (nums[s[i].code - 'a'.code] < k) {
                var j = i + 1
                while (j < s.length && nums[s[j].code - 'a'.code] < k) {
                    j++
                }
                return Math.max(helper(s, k, start, i), helper(s, k, j, end))
            }
        }
        return end - start
    }
}
