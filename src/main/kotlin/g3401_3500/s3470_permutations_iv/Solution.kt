package g3401_3500.s3470_permutations_iv

// #Hard #Array #Math #Enumeration #Combinatorics
// #2025_03_06_Time_3_ms_(100.00%)_Space_46.15_MB_(6.45%)

class Solution {
    fun permute(n: Int, k: Long): IntArray {
        val perm = LongArray(n + 1)
        perm[1] = 1L
        for (i in 2..n) {
            if (perm[i - 1] > 10_000_000_000_000_000) {
                perm[i] = perm[i - 1]
            } else {
                perm[i] = ((i + 2) / 2) * perm[i - 1]
            }
        }
        val used = BooleanArray(n + 1)
        val result = IntArray(n)
        var index = 0
        // Deal with the edge cases first
        if (n < 3) {
            if (k > n) return intArrayOf()
            if (k == 2L) return intArrayOf(2, 1)
            if (n == 1) return intArrayOf(1)
            return intArrayOf(1, 2)
        }
        val firstCycle = (((k.toLong() - 1L) / perm[n - 2]).toInt()) + 1
        var odd = 2
        if (n % 2 == 0) {
            if (firstCycle > n) return intArrayOf()
            result[index++] = firstCycle
            used[firstCycle] = true
            if (firstCycle % 2 == 0) {
                odd = 1
            }
        } else {
            val first = firstCycle * 2 - 1
            if (first > n) {
                return intArrayOf()
            }
            result[index++] = first
            used[first] = true
        }
        var rem = ((k - 1L) % perm[n - 2]) + 1L
        fun findNum(start: Int, nth: Int): Int {
            var toFind = nth
            for (i in start..n step 2) {
                if (used[i] == false) {
                    toFind--
                    if (toFind == 0) {
                        return i
                    }
                }
            }
            return -1
        }
        for (i in n - 3 downTo 1) {
            val nextNum = ((rem - 1) / perm[i]).toInt()
            val nextDigit = findNum(odd, nextNum + 1)
            result[index++] = nextDigit
            used[nextDigit] = true
            rem = ((rem - 1L) % perm[i]) + 1L
            odd = 3 - odd
        }
        result[index++] = findNum(odd, 1)
        odd = 3 - odd
        result[index] = findNum(odd, 1)
        return result
    }
}
