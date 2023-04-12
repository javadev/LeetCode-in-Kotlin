package g0801_0900.s0899_orderly_queue

// #Hard #String #Math #Sorting #2023_04_12_Time_148_ms_(100.00%)_Space_35.6_MB_(66.67%)

class Solution {
    fun orderlyQueue(s: String, k: Int): String {
        if (k > 1) {
            val ans = s.toCharArray()
            ans.sort()
            return String(ans)
        }
        var min = 'z'
        val list = ArrayList<Int>()
        for (element in s) {
            if (element < min) {
                min = element
            }
        }
        for (i in s.indices) {
            if (s[i] == min) {
                list.add(i)
            }
        }
        var ans = s
        for (integer in list) {
            val after = s.substring(0, integer)
            val before = s.substring(integer)
            val f = before + after
            if (f < ans) {
                ans = f
            }
        }
        return ans
    }
}
