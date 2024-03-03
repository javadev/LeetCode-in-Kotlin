package g3001_3100.s3044_most_frequent_prime

// #Medium #Array #Hash_Table #Math #Matrix #Counting #Enumeration #Number_Theory
// #2024_02_29_Time_6_ms_(100.00%)_Space_43.6_MB_(97.08%)

import kotlin.math.max
import kotlin.math.sqrt

@Suppress("NAME_SHADOWING")
class Solution {
    private var max = 0
    private var freqNum = -1

    fun mostFrequentPrime(mat: Array<IntArray>): Int {
        val nexts =
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(-1, -1),
                intArrayOf(1, -1),
                intArrayOf(-1, 1),
                intArrayOf(0, 1),
                intArrayOf(0, -1),
                intArrayOf(1, 0),
                intArrayOf(-1, 0)
            )
        val m = mat.size
        val n = mat[0].size
        val primeFreq: MutableMap<Int, Int> = HashMap()
        for (i in 0 until m) {
            for (j in 0 until n) {
                for (next in nexts) {
                    getPrime(i, j, mat, 0, next, primeFreq)
                }
            }
        }
        return freqNum
    }

    private fun getPrime(
        i: Int,
        j: Int,
        mat: Array<IntArray>,
        num: Int,
        next: IntArray,
        primeFreq: MutableMap<Int, Int>
    ) {
        var num = num
        val m = mat.size
        val n = mat[0].size
        if (i < 0 || j < 0 || i == m || j == n) {
            return
        }
        num = num * 10 + mat[i][j]
        if (num > 10 && isPrime(num)) {
            val count = primeFreq.getOrDefault(num, 0) + 1
            if ((count == max && freqNum < num) || count > max) {
                freqNum = num
            }
            max = max(max, count)
            primeFreq[num] = count
        }
        getPrime(i + next[0], j + next[1], mat, num, next, primeFreq)
    }

    private fun isPrime(num: Int): Boolean {
        if (num == 2) {
            return true
        }
        if (num == 1 || (num and 1) == 0) {
            return false
        }
        val n = sqrt(num.toDouble()).toInt()
        var i = 3
        while (i <= n) {
            if ((num % i) == 0) {
                return false
            }
            i += 2
        }
        return true
    }
}
