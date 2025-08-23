package g3601_3700.s3653_xor_after_range_multiplication_queries_i

// #Medium #Array #Simulation #Divide_and_Conquer #Weekly_Contest_463
// #2025_08_20_Time_26_ms_(100.00%)_Space_72.10_MB_(44.44%)

class Solution {
    private fun modPow(a0: Long, e0: Long): Long {
        var a = a0 % MOD
        var e = e0
        var res = 1L
        while (e > 0) {
            if ((e and 1L) == 1L) {
                res = (res * a) % MOD
            }
            a = (a * a) % MOD
            e = e shr 1
        }
        return res
    }

    private fun modInv(a: Long): Long {
        return modPow(a, MOD - 2L)
    }

    fun xorAfterQueries(nums: IntArray, queries: Array<IntArray>): Int {
        val n = nums.size
        val b = kotlin.math.sqrt(n.toDouble()).toInt()
        val small = HashMap<Int, Array<LongArray?>>()

        for (query in queries) {
            val l = query[0]
            val r = query[1]
            val k = query[2]
            val v = query[3]
            if (k > b) {
                var i = l
                while (i <= r) {
                    nums[i] = ((nums[i].toLong() * v.toLong()) % MOD).toInt()
                    i += k
                }
            } else {
                val byResidue = small.getOrPut(k) { arrayOfNulls<LongArray>(k) }
                val res = l % k
                if (byResidue[res] == null) {
                    val len = (n - res + k - 1) / k
                    byResidue[res] = LongArray(len + 1) { 1L }
                }
                val diff = byResidue[res]!!
                val jStart = (l - res) / k
                val jEnd = (r - res) / k
                diff[jStart] = (diff[jStart] * v.toLong()) % MOD
                if (jEnd + 1 < diff.size) {
                    diff[jEnd + 1] = (diff[jEnd + 1] * modInv(v.toLong())) % MOD
                }
            }
        }
        for ((k, byResidue) in small) {
            for (res in 0 until k) {
                val diff = byResidue[res] ?: continue
                var mul = 1L
                for (j in 0 until diff.size - 1) {
                    mul = (mul * diff[j]) % MOD
                    val idx = res + j * k
                    if (idx < n) {
                        nums[idx] = ((nums[idx].toLong() * mul) % MOD).toInt()
                    }
                }
            }
        }
        var ans = 0
        for (x in nums) {
            ans = ans xor x
        }
        return ans
    }

    companion object {
        private const val MOD = 1000000007L
    }
}
