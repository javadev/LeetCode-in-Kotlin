package g3101_3200.s3145_find_products_of_elements_of_big_array

// #Hard #Array #Binary_Search #Bit_Manipulation
// #2024_05_15_Time_210_ms_(100.00%)_Space_40_MB_(100.00%)

class Solution {
    fun findProductsOfElements(queries: Array<LongArray>): IntArray {
        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val q = queries[i]
            val er = sumE(q[1] + 1)
            val el = sumE(q[0])
            ans[i] = pow(2, er - el, q[2])
        }
        return ans
    }

    private fun sumE(k: Long): Long {
        var k = k
        var res: Long = 0
        var n: Long = 0
        var cnt1: Long = 0
        var sumI: Long = 0
        for (i in 63L - java.lang.Long.numberOfLeadingZeros(k + 1) downTo 1) {
            val c = (cnt1 shl i.toInt()) + (i shl (i - 1).toInt())
            if (c <= k) {
                k -= c
                res += (sumI shl i.toInt()) + ((i * (i - 1) / 2) shl (i - 1).toInt())
                sumI += i
                cnt1++
                n = n or (1L shl i.toInt())
            }
        }
        if (cnt1 <= k) {
            k -= cnt1
            res += sumI
            n++
        }
        while (k-- > 0) {
            res += java.lang.Long.numberOfTrailingZeros(n).toLong()
            n = n and n - 1
        }
        return res
    }

    private fun pow(x: Long, n: Long, mod: Long): Int {
        var x = x
        var n = n
        var res = 1 % mod
        while (n > 0) {
            if (n % 2 == 1L) {
                res = (res * x) % mod
            }
            x = (x * x) % mod
            n /= 2
        }
        return res.toInt()
    }
}
