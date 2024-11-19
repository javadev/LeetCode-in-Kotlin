package g1301_1400.s1397_find_all_good_strings

// #Hard #String #Dynamic_Programming #String_Matching
// #2023_06_06_Time_273_ms_(100.00%)_Space_36.3_MB_(100.00%)

@Suppress("NAME_SHADOWING", "UNUSED_PARAMETER")
class Solution {
    private val mod = 1000000007
    private lateinit var next: IntArray

    fun findGoodStrings(n: Int, s1: String, s2: String, evil: String): Int {
        var s1 = s1
        val s1arr = s1.toCharArray()
        for (i in s1.length - 1 downTo 0) {
            if (s1arr[i] > 'a') {
                s1arr[i] = (s1arr[i].code - 1).toChar()
                break
            } else {
                s1arr[i] = 'z'
            }
        }
        s1 = String(s1arr)
        next = getNext(evil)
        return if (s1.compareTo(s2) > 0) {
            lessOrEqualThan(s2, evil)
        } else {
            (lessOrEqualThan(s2, evil) - lessOrEqualThan(s1, evil) + mod) % mod
        }
    }

    private fun lessOrEqualThan(s: String, e: String): Int {
        val dp = Array(s.length + 1) { Array(e.length + 1) { LongArray(2) } }
        dp[0][0][1] = 1
        var res: Long = 0
        for (i in 0 until s.length) {
            for (state in 0 until e.length) {
                run {
                    var c = 'a'
                    while (c <= 'z') {
                        val nextstate = getNextState(state, c, e)
                        dp[i + 1][nextstate][0] = (dp[i + 1][nextstate][0] + dp[i][state][0]) % mod
                        c++
                    }
                }
                var c = 'a'
                while (c < s[i]) {
                    val nextstate = getNextState(state, c, e)
                    dp[i + 1][nextstate][0] = (dp[i + 1][nextstate][0] + dp[i][state][1]) % mod
                    c++
                }
                val nextstate = getNextState(state, s[i], e)
                dp[i + 1][nextstate][1] = (dp[i + 1][nextstate][1] + dp[i][state][1]) % mod
            }
        }
        for (i in 0 until e.length) {
            res = (res + dp[s.length][i][0]) % mod
            res = (res + dp[s.length][i][1]) % mod
        }
        return res.toInt()
    }

    private fun getNextState(prevState: Int, nextChar: Char, evil: String): Int {
        var idx = prevState
        while (idx != -1 && evil[idx] != nextChar) {
            idx = next[idx]
        }
        return idx + 1
    }

    private fun getNext(e: String): IntArray {
        val len = e.length
        val localNext = IntArray(len)
        localNext[0] = -1
        var last = -1
        var i = 0
        while (i < len - 1) {
            if (last == -1 || e[i] == e[last]) {
                i++
                last++
                localNext[i] = last
            } else {
                last = localNext[last]
            }
        }
        return localNext
    }
}
