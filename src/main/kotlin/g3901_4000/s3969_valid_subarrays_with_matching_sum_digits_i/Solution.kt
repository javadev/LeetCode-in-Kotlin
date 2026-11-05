package g3901_4000.s3969_valid_subarrays_with_matching_sum_digits_i

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window #Enumeration #Senior #Weekly_Contest_507
// #2026_11_03_Time_50_ms_(98.27%)_Space_46.22_MB_(95.95%)

class Solution {
    fun countValidSubarrays(nums: IntArray, x: Int): Int {
        val n = nums.size
        val pre = LongArray(n + 1)
        for (i in 0..<n) {
            pre[i + 1] = pre[i] + nums[i]
        }
        if (x == 0) {
            return 0
        }
        val interval: MutableList<LongArray> = ArrayList<LongArray>()
        var p: Long = 1
        while (p <= pre[n]) {
            interval.add(longArrayOf(p * x, p * x + p - 1))
            p *= 10
        }
        val isit: Array<MutableList<Long>> = Array<MutableList<Long>>(10) { ArrayList() }
        for (r in 0..9) {
            isit[r] = ArrayList<Long>()
        }
        var sum: Long = 0
        for (i in 0..n) {
            if (i > 0) {
                val k = pre[i]
                val r = (((k - x) % 10 + 10) % 10).toInt()
                val list: MutableList<Long> = isit[r]
                for (j in interval) {
                    val a = k - j[1]
                    val b = k - j[0]
                    if (b < 0) {
                        continue
                    }
                    val high = upper(list, b)
                    val low = lower(list, a)
                    sum += (high - low).toLong()
                }
            }
            isit[(pre[i] % 10).toInt()].add(pre[i])
        }
        return sum.toInt()
    }

    private fun lower(list: MutableList<Long>, k: Long): Int {
        var l = 0
        var h = list.size
        while (l < h) {
            val m = (l + h) ushr 1
            if (list[m] < k) {
                l = m + 1
            } else {
                h = m
            }
        }
        return l
    }

    private fun upper(list: MutableList<Long>, k: Long): Int {
        var l = 0
        var h = list.size
        while (l < h) {
            val m = (l + h) ushr 1
            if (list[m] <= k) {
                l = m + 1
            } else {
                h = m
            }
        }
        return l
    }
}
