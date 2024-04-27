package g3101_3200.s3116_kth_smallest_amount_with_single_denomination_combination

// #Hard #Array #Math #Binary_Search #Bit_Manipulation #Number_Theory #Combinatorics
// #2024_04_27_Time_158_ms_(100.00%)_Space_37.8_MB_(22.22%)

import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    fun findKthSmallest(coins: IntArray, k: Int): Long {
        var minC = Int.MAX_VALUE
        for (c in coins) {
            minC = min(minC, c)
        }
        val cc = coins(coins)
        var max = minC.toLong() * k
        var min = max / coins.size
        while (min < max) {
            val mid = (min + max) / 2
            val cnt = count(cc, mid)
            if (cnt > k) {
                max = mid - 1
            } else if (cnt < k) {
                min = mid + 1
            } else {
                max = mid
            }
        }
        return min
    }

    private fun count(coins: LongArray, v: Long): Long {
        var r: Long = 0
        for (c in coins) {
            r += v / c
        }
        return r
    }

    private fun coins(coins: IntArray): LongArray {
        var coins = coins
        coins.sort()
        var len = 1
        a@ for (i in 1 until coins.size) {
            val c = coins[i]
            for (j in 0 until len) {
                if (c % coins[j] == 0) {
                    continue@a
                }
            }
            coins[len++] = c
        }
        coins = coins.copyOf(len)
        val res = LongArray((1 shl coins.size) - 1)
        iterate(coins, res, 1, 0, 0, true)
        return res
    }

    private fun iterate(coins: IntArray, res: LongArray, mult: Long, start: Int, idx: Int, positive: Boolean): Int {
        var idx = idx
        for (i in start until coins.size) {
            val next = mult * coins[i] / gcd(mult, coins[i].toLong())
            res[idx++] = if (positive) next else -next
            idx = iterate(coins, res, next, i + 1, idx, !positive)
        }
        return idx
    }

    private fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }
}
