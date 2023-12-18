package g2801_2900.s2836_maximize_value_of_function_in_a_ball_passing_game

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2023_12_18_Time_933_ms_(100.00%)_Space_121.8_MB_(100.00%)

import kotlin.math.floor
import kotlin.math.ln
import kotlin.math.max

class Solution {
    fun getMaxFunctionValue(receiver: List<Int>, k: Long): Long {
        val upper = floor(ln(k.toDouble()) / ln(2.0)).toInt()
        val n = receiver.size
        val next = Array(n) { IntArray(upper + 1) }
        val res = Array(n) { LongArray(upper + 1) }

        val kBit = IntArray(upper + 1)
        var currK = k
        for (x in 0 until n) {
            next[x][0] = receiver[x]
            res[x][0] = receiver[x].toLong()
        }
        for (i in 0..upper) {
            kBit[i] = (currK and 1L).toInt()
            currK = currK shr 1
        }

        for (i in 1..upper) {
            for (x in 0 until n) {
                val nxt = next[x][i - 1]
                next[x][i] = next[nxt][i - 1]
                res[x][i] = res[x][i - 1] + res[nxt][i - 1]
            }
        }
        var ans: Long = 0
        for (x in 0 until n) {
            var sum = x.toLong()
            var i = 0
            var curr = x
            while (i <= upper) {
                if (kBit[i] == 0) {
                    i++
                    continue
                }
                sum += res[curr][i]
                curr = next[curr][i]
                i++
            }
            ans = max(ans, sum)
        }
        return ans
    }
}
