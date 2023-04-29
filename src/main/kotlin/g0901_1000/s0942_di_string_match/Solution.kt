package g0901_1000.s0942_di_string_match

// #Easy #Array #String #Math #Greedy #Two_Pointers
// #2023_04_29_Time_202_ms_(80.00%)_Space_45.6_MB_(10.00%)

class Solution {
    fun diStringMatch(s: String): IntArray {
        val arr = IntArray(s.length + 1)
        var max = s.length
        for (i in s.indices) {
            if (s[i] == 'D') {
                arr[i] = max
                max--
            }
        }
        run {
            var i = s.length - 1
            while (i >= 0 && max > 0) {
                if (s[i] == 'I' && arr[i + 1] == 0) {
                    arr[i + 1] = max
                    max--
                }
                i--
            }
        }
        var i = 0
        while (i < arr.size && max > 0) {
            if (arr[i] == 0) {
                arr[i] = max
                max--
            }
            i++
        }
        return arr
    }
}
