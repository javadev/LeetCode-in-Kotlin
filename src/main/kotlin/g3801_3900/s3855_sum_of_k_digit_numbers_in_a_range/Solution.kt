package g3801_3900.s3855_sum_of_k_digit_numbers_in_a_range

// #Hard #Math #Divide_and_Conquer #Number_Theory #Combinatorics #Senior_Staff #Biweekly_Contest_177
// #2026_07_27_Time_2_ms_(90.59%)_Space_43.08_MB_(36.47%)

class Solution {
    fun sumOfNumbers(l: Int, r: Int, k: Int): Int {
        val count = r - l.toLong() + 1
        val sumRange = (l + r) * count / 2
        val t1: Long = sumRange % MOD
        val t2 = power(count, k.toLong() - 1)
        val repunit: Long = (power(10, k.toLong()) - 1 + MOD) % MOD
        val inv9 = power(9, MOD.toLong() - 2)
        val t3: Long = (repunit * inv9) % MOD
        var ans: Long = (t1 * t2) % MOD
        ans = (ans * t3) % MOD
        return ans.toInt()
    }

    private fun power(base: Long, exp: Long): Long {
        var base = base
        var exp = exp
        var res: Long = 1
        base %= MOD.toLong()
        while (exp > 0) {
            if (exp % 2 == 1L) {
                res = (res * base) % MOD
            }
            base = (base * base) % MOD
            exp /= 2
        }
        return res
    }

    companion object {
        private const val MOD = 1000000007
    }
}
