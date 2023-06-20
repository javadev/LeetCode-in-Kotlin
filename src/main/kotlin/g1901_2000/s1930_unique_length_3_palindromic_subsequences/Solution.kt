package g1901_2000.s1930_unique_length_3_palindromic_subsequences

// #Medium #String #Hash_Table #Prefix_Sum #2023_06_20_Time_273_ms_(100.00%)_Space_39.3_MB_(91.67%)

class Solution {
    fun countPalindromicSubsequence(s: String): Int {
        val last = IntArray(26)
        last.fill(-1)
        for (i in s.length - 1 downTo 0) {
            if (last[s[i].code - 'a'.code] == -1) {
                last[s[i].code - 'a'.code] = i
            }
        }
        var ans = 0
        val count = IntArray(26)
        val first: MutableMap<Int, IntArray> = HashMap()
        for (i in 0 until s.length) {
            val cur = s[i].code - 'a'.code
            if (last[cur] - i <= 1 && !first.containsKey(cur)) {
                last[cur] = -1
            }
            if (last[cur] == i) {
                val oldCount = first[cur]
                for (j in 0..25) {
                    if (count[j] - oldCount!![j] > 0) {
                        ans++
                    }
                }
            }
            count[cur]++
            if (last[cur] > -1 && !first.containsKey(cur)) {
                first[cur] = count.clone()
            }
        }
        return ans
    }
}
