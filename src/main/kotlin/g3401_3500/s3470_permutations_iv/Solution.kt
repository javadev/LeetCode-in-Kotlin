package g3401_3500.s3470_permutations_iv

// #Hard #Array #Math #Enumeration #Combinatorics
// #2025_03_06_Time_4_ms_(96.77%)_Space_45.40_MB_(9.68%)

class Solution {
    private val maxFac = 100_000_000L

    fun permute(n: Int, k: Long): IntArray {
        var res = IntArray(n)
        var k = k - 1
        val fac = LongArray(n / 2 + 1)
        fac[0] = 1
        for (i in 1..n / 2) {
            fac[i] = fac[i - 1] * i
            if (fac[i] >= maxFac) {
                fac[i] = maxFac
            }
        }
        var evenNum = n / 2
        var oddNum = n - evenNum
        var evens = mutableListOf<Int>()
        var odds = mutableListOf<Int>()
        for (i in 1..n) {
            if (i % 2 == 0) {
                evens.add(i)
            } else {
                odds.add(i)
            }
        }
        for (i in 0..<n) {
            if (i == 0) {
                if (n % 2 == 0) {
                    val trailCombs = fac[evenNum] * fac[evenNum - 1]
                    val leadIdx = (k / trailCombs).toInt()
                    if (leadIdx + 1 > n) return IntArray(0)
                    res[i] = leadIdx + 1
                    if ((leadIdx + 1) % 2 == 0) {
                        evens.remove(leadIdx + 1)
                    } else {
                        odds.remove(leadIdx + 1)
                    }
                    k = k % trailCombs
                } else {
                    val trailCombs = fac[oddNum - 1] * fac[evenNum]
                    val leadIdx = (k / trailCombs).toInt()
                    if (leadIdx >= odds.size) return IntArray(0)
                    val num = odds.removeAt(leadIdx)
                    res[i] = num
                    k = k % trailCombs
                }
            } else {
                if (res[i - 1] % 2 == 0) {
                    val trailCombs = fac[evenNum] * fac[oddNum - 1]
                    val leadIdx = (k / trailCombs).toInt()
                    val num = odds.removeAt(leadIdx)
                    res[i] = num
                    k = k % trailCombs
                } else {
                    val trailCombs = fac[evenNum - 1] * fac[oddNum ]
                    val leadIdx = (k / trailCombs).toInt()
                    val num = evens.removeAt(leadIdx)
                    res[i] = num
                    k = k % trailCombs
                }
            }
            if (res[i] % 2 == 0) {
                evenNum--
            } else {
                oddNum--
            }
        }
        return res
    }
}
