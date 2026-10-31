package g3701_3800.s3776_minimum_moves_to_balance_circular_array

// #Medium #Array #Sorting #Greedy #Staff #Weekly_Contest_480
// #2026_05_08_Time_2_ms_(100.00%)_Space_139.96_MB_(20.95%)

import kotlin.math.min

class Solution {
    fun minMoves(balance: IntArray): Long {
        val n = balance.size
        var j = -1
        var total: Long = 0
        var res: Long = 0
        for (i in 0..<n) {
            if (balance[i] < 0) {
                j = i
            }
            total += balance[i].toLong()
        }
        if (j == -1) {
            return 0
        }
        if (total < 0) {
            return -1
        }
        var d = 1
        while (balance[j] < 0) {
            val storage = balance[(j + d) % n] + balance[(j - d % n + n) % n].toLong()
            res += (min(-balance[j], storage.toInt()) * d).toLong()
            balance[j] += storage.toInt()
            ++d
        }
        return res
    }
}
