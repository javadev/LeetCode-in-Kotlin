package g3501_3600.s3518_smallest_palindromic_rearrangement_ii

// #Hard #String #Hash_Table #Math #Counting #Combinatorics
// #2025_04_14_Time_27_ms_(100.00%)_Space_48.58_MB_(100.00%)

class Solution {
    fun smallestPalindrome(inputStr: String, k: Int): String {
        var k = k
        val frequency = IntArray(26)
        for (i in 0..<inputStr.length) {
            val ch = inputStr[i]
            frequency[ch.code - 'a'.code]++
        }
        var mid = 0.toChar()
        for (i in 0..25) {
            if (frequency[i] % 2 == 1) {
                mid = ('a'.code + i).toChar()
                frequency[i]--
                break
            }
        }
        val halfFreq = IntArray(26)
        var halfLength = 0
        for (i in 0..25) {
            halfFreq[i] = frequency[i] / 2
            halfLength += halfFreq[i]
        }
        val totalPerms = multinomial(halfFreq)
        if (k > totalPerms) {
            return ""
        }
        val firstHalfBuilder = StringBuilder()
        for (i in 0..<halfLength) {
            for (c in 0..25) {
                if (halfFreq[c] > 0) {
                    halfFreq[c]--
                    val perms = multinomial(halfFreq)
                    if (perms >= k) {
                        firstHalfBuilder.append(('a'.code + c).toChar())
                        break
                    } else {
                        k -= perms.toInt()
                        halfFreq[c]++
                    }
                }
            }
        }
        val firstHalf = firstHalfBuilder.toString()
        val revHalf = StringBuilder(firstHalf).reverse().toString()
        return if (mid.code == 0) {
            firstHalf + revHalf
        } else {
            firstHalf + mid + revHalf
        }
    }

    private fun multinomial(counts: IntArray): Long {
        var tot = 0
        for (cnt in counts) {
            tot += cnt
        }
        var res: Long = 1
        for (i in 0..25) {
            val cnt = counts[i]
            res = res * binom(tot, cnt)
            if (res >= MAX_K) {
                return MAX_K
            }
            tot -= cnt
        }
        return res
    }

    private fun binom(n: Int, k: Int): Long {
        var k = k
        if (k > n) {
            return 0
        }
        if (k > n - k) {
            k = n - k
        }
        var result: Long = 1
        for (i in 1..k) {
            result = result * (n - i + 1) / i
            if (result >= MAX_K) {
                return MAX_K
            }
        }
        return result
    }

    companion object {
        private const val MAX_K: Long = 1000001
    }
}
