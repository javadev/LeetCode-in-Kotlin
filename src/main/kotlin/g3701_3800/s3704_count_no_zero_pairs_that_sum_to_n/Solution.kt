package g3701_3800.s3704_count_no_zero_pairs_that_sum_to_n

// #Hard #Weekly_Contest_470 #2025_10_06_Time_11_ms_(100.00%)_Space_42.73_MB_(100.00%)

class Solution {
    fun countNoZeroPairs(n: Long): Long {
        var m = 0
        var base: Long = 1
        while (base <= n) {
            m++
            base = base * 10
        }
        val digits = IntArray(m)
        var c = n
        for (i in 0..<m) {
            digits[i] = (c % 10).toInt()
            c = c / 10
        }
        var total: Long = 0
        var extra = longArrayOf(1, 0)
        base = 1
        for (p in 0..<m) {
            val nextExtra = longArrayOf(0, 0)
            for (e in 0..1) {
                for (i in 1..9) {
                    for (j in 1..9) {
                        if ((i + j + e) % 10 == digits[p]) {
                            nextExtra[(i + j + e) / 10] += extra[e]
                        }
                    }
                }
            }
            extra = nextExtra
            base = base * 10
            for (e in 0..1) {
                val left = n / base - e
                if (left < 0) {
                    continue
                }
                if (left == 0L) {
                    total += extra[e]
                } else if (isGood(left)) {
                    total += 2 * extra[e]
                }
            }
        }

        return total
    }

    private fun isGood(num: Long): Boolean {
        var num = num
        while (num > 0) {
            if (num % 10 == 0L) {
                return false
            }
            num = num / 10
        }
        return true
    }
}
