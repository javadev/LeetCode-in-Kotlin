package g0901_1000.s0984_string_without_aaa_or_bbb

// #Medium #String #Greedy #2023_05_10_Time_132_ms_(66.67%)_Space_34.9_MB_(16.67%)

class Solution {
    fun strWithout3a3b(a: Int, b: Int): String {
        val first = if (a > b) "a" else "b"
        val second = if (first == "a") "b" else "a"
        var firstLen = a.coerceAtLeast(b)
        var secondLen = a.coerceAtMost(b)
        val ans = StringBuilder()
        // Case 1 : A and B count are unequal.
        while (firstLen > 0 && secondLen > 0 && firstLen != secondLen) {
            ans.append(first)
            ans.append(first)
            firstLen = firstLen - 2
            ans.append(second)
            secondLen--
        }
        // Case 2: A and B count are equal
        while (firstLen > 0 && secondLen > 0) {
            ans.append(first)
            ans.append(second)
            firstLen--
            secondLen--
        }
        // left over, just append
        while (firstLen > 0) {
            ans.append(first)
            firstLen--
        }
        return ans.toString()
    }
}
