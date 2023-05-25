package g1101_1200.s1191_k_concatenation_maximum_sum

// #Medium #Array #Dynamic_Programming #2023_05_25_Time_389_ms_(100.00%)_Space_77.8_MB_(100.00%)

class Solution {
    private var mod = (1e9 + 7).toInt()

    fun kConcatenationMaxSum(arr: IntArray, k: Int): Int {
        var sum: Long = 0
        for (i in arr.indices) {
            sum += arr[i].toLong()
        }
        return if (sum <= 0 || k == 1) {
            var cb: Long = 0
            var ob: Long = 0
            for (i in arr.indices) {
                cb = if (arr[i] + cb > arr[i]) {
                    arr[i] + cb
                } else {
                    arr[i].toLong()
                }
                if (ob < cb) {
                    ob = cb
                }
            }
            if (k == 1) {
                return (ob % mod).toInt()
            }
            for (i in arr.indices) {
                cb = if (arr[i] + cb > arr[i]) {
                    arr[i] + cb
                } else {
                    arr[i].toLong()
                }
                if (ob < cb) {
                    ob = cb
                }
            }
            (ob % mod).toInt()
        } else {
            var max1: Long = 0
            var smax: Long = 0
            for (i in arr.indices.reversed()) {
                smax += arr[i].toLong()
                if (smax > max1) {
                    max1 = smax
                }
            }
            max1 %= mod.toLong()
            var max2: Long = 0
            smax = 0
            for (i in arr.indices) {
                smax += arr[i].toLong()
                if (smax > max2) {
                    max2 = smax
                }
            }
            max2 %= mod.toLong()
            val ans = max1 + (k - 2) * sum + max2
            (ans % mod).toInt()
        }
    }
}
