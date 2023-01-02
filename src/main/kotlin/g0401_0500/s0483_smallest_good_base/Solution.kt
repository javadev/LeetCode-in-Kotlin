package g0401_0500.s0483_smallest_good_base

// #Hard #Math #Binary_Search #2023_01_02_Time_164_ms_(100.00%)_Space_33.9_MB_(100.00%)

class Solution {
    fun smallestGoodBase(n: String): String {
        return sol1(n)
    }

    private fun sol1(n: String): String {
        val x = n.toLong()
        val ans: MutableList<Long> = ArrayList()
        ans.add(x - 1)
        val y = x - 1
        for (i in 2..62) {
            val dm = Math.pow(y.toDouble(), 1.0 / i)
            val dml = dm.toLong()
            var j = 0
            while (j > -3 && dml + j > 1) {
                val d = dml + j
                if (y % d == 0L) {
                    val poly = poly(d, i)
                    if (poly == x) {
                        ans.add(d)
                    }
                }
                j--
            }
        }
        val end = ans[ans.size - 1]
        return end.toString() + ""
    }

    private fun poly(b: Long, n: Int): Long {
        var ans: Long = 1
        var m: Long = 1
        for (i in 0 until n) {
            m *= b
            ans += m
        }
        return ans
    }
}
