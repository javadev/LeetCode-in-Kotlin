package g3601_3700.s3655_xor_after_range_multiplication_queries_ii

// #Hard #Array #Divide_and_Conquer #Weekly_Contest_463
// #2025_08_20_Time_26_ms_(100.00%)_Space_137.89_MB_(50.00%)

class Solution {
    private fun inv(a: Int): Int {
        var b = a.toLong()
        var r = 1L
        var e = MOD - 2L
        while (e > 0L) {
            if ((e and 1L) == 1L) {
                r = (r * b) % MOD
            }
            b = (b * b) % MOD
            e = e shr 1
        }
        return r.toInt()
    }

    fun xorAfterQueries(nums: IntArray, queries: Array<IntArray>): Int {
        val n = nums.size
        val b = kotlin.math.sqrt(n.toDouble()).toInt() + 1
        val byK = arrayOfNulls<Array<ArrayList<IntArray>?>>(b + 1)
        val big = ArrayList<IntArray>()
        for (q in queries) {
            val l = q[0]
            val r = q[1]
            val k = q[2]
            val v = q[3]
            if (k <= b) {
                if (byK[k] == null) {
                    byK[k] = arrayOfNulls(k)
                }
                val arr = byK[k]!!
                val res = l % k
                if (arr[res] == null) {
                    arr[res] = ArrayList()
                }
                arr[res]!!.add(intArrayOf(l, r, v))
            } else {
                big.add(intArrayOf(l, r, k, v))
            }
        }
        for (k in 1..b) {
            val arr = byK[k] ?: continue
            for (res in 0 until k) {
                val list = arr[res] ?: continue
                val len = (n - 1 - res) / k + 1
                val diff = LongArray(len + 1) { 1L }
                for (q in list) {
                    val l = q[0]
                    val r = q[1]
                    val v = q[2]
                    val tL = (l - res) / k
                    val tR = (r - res) / k
                    diff[tL] = (diff[tL] * v.toLong()) % MOD
                    val p = tR + 1
                    if (p < len) {
                        diff[p] = (diff[p] * inv(v).toLong()) % MOD
                    }
                }
                var cur = 1L
                var idx = res
                for (t in 0 until len) {
                    cur = (cur * diff[t]) % MOD
                    nums[idx] = ((nums[idx].toLong() * cur) % MOD).toInt()
                    idx += k
                }
            }
        }
        for (q in big) {
            val l = q[0]
            val r = q[1]
            val k = q[2]
            val v = q[3]
            var i = l
            while (i <= r) {
                nums[i] = ((nums[i].toLong() * v.toLong()) % MOD).toInt()
                i += k
            }
        }
        var ans = 0
        for (x in nums) {
            ans = ans xor x
        }
        return ans
    }

    companion object {
        private const val MOD = 1_000_000_007L
    }
}
