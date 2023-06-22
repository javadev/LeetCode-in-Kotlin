package g1801_1900.s1896_minimum_cost_to_change_the_final_value_of_expression

// #Hard #String #Dynamic_Programming #Math #Stack
// #2023_06_22_Time_252_ms_(100.00%)_Space_41.3_MB_(100.00%)

class Solution {
    private class Result(var `val`: Int, var minFlips: Int)

    private var cur = 0

    fun minOperationsToFlip(expression: String): Int {
        cur = 0
        return term(expression).minFlips
    }

    private fun term(s: String): Result {
        var res = factor(s)
        while (cur < s.length && (s[cur] == '|' || s[cur] == '&')) {
            val c = s[cur]
            cur++
            res = if (c == '|') {
                or(res, factor(s))
            } else {
                and(res, factor(s))
            }
        }
        return res
    }

    private fun factor(s: String): Result {
        if (s[cur] == '(') {
            cur++
            val res = term(s)
            cur++
            return res
        }
        return number(s)
    }

    private fun number(s: String): Result {
        return if (s[cur] == '1') {
            cur++
            Result(1, 1)
        } else {
            cur++
            Result(0, 1)
        }
    }

    private fun or(res1: Result, res2: Result): Result {
        return if (res1.`val` + res2.`val` == 0) {
            Result(
                0,
                Math.min(res1.minFlips, res2.minFlips)
            )
        } else if (res1.`val` + res2.`val` == 2) {
            Result(
                1,
                1 + Math.min(res1.minFlips, res2.minFlips)
            )
        } else {
            Result(1, 1)
        }
    }

    private fun and(res1: Result, res2: Result): Result {
        return if (res1.`val` + res2.`val` == 0) {
            Result(
                0,
                1 + Math.min(res1.minFlips, res2.minFlips)
            )
        } else if (res1.`val` + res2.`val` == 2) {
            Result(
                1,
                Math.min(res1.minFlips, res2.minFlips)
            )
        } else {
            Result(0, 1)
        }
    }
}
