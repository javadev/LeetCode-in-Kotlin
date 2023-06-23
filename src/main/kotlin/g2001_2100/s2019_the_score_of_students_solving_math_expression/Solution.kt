package g2001_2100.s2019_the_score_of_students_solving_math_expression

// #Hard #Array #String #Dynamic_Programming #Math #Stack #Memoization
// #2023_06_23_Time_1497_ms_(100.00%)_Space_48.2_MB_(100.00%)

import java.util.ArrayDeque

class Solution {
    private lateinit var dp: Array<Array<HashSet<Int>?>>

    fun scoreOfStudents(s: String, answers: IntArray): Int {
        val st = ArrayDeque<Int>()
        val n = s.length
        var i = 0
        dp = Array(n) { arrayOfNulls<HashSet<Int>?>(n) }
        while (i < n) {
            if (s[i].code - '0'.code >= 0 && s[i].code - '9'.code <= 0) {
                st.push(s[i].code - '0'.code)
                i++
            } else if (s[i] == '*') {
                val cur = st.pop() * (s[i + 1].code - '0'.code)
                i += 2
                st.push(cur)
            } else {
                i++
            }
        }
        var res = 0
        var ret = 0
        while (st.isNotEmpty()) {
            res += st.pop()
        }
        val wrong = opts(0, n - 1, s)
        for (ans in answers) {
            if (ans == res) {
                ret += 5
            } else if (wrong!!.contains(ans)) {
                ret += 2
            }
        }
        return ret
    }

    private fun opts(i: Int, j: Int, s: String): HashSet<Int>? {
        if (dp[i][j] != null) {
            return dp[i][j]
        }
        if (i == j) {
            val res = HashSet<Int>()
            res.add(s[i].code - '0'.code)
            dp[i][j] = res
            return res
        }
        val res = HashSet<Int>()
        var x = i + 1
        while (x < j) {
            val op = s[x]
            val left = opts(i, x - 1, s)
            val right = opts(x + 1, j, s)
            if (op == '*') {
                for (l in left!!) {
                    for (r in right!!) {
                        if (l * r <= 1000) {
                            res.add(l * r)
                        }
                    }
                }
            } else {
                for (l in left!!) {
                    for (r in right!!) {
                        if (l + r <= 1000) {
                            res.add(l + r)
                        }
                    }
                }
            }
            x += 2
        }
        dp[i][j] = res
        return res
    }
}
