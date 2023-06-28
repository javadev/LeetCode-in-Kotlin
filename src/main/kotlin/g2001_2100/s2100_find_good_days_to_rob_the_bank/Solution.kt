package g2001_2100.s2100_find_good_days_to_rob_the_bank

// #Medium #Array #Dynamic_Programming #Prefix_Sum
// #2023_06_28_Time_695_ms_(100.00%)_Space_52.7_MB_(100.00%)

class Solution {
    fun goodDaysToRobBank(security: IntArray, time: Int): List<Int> {
        val n = security.size
        // dec: # of non-increasing elements before [i]
        // inc: # of non-decreasing elements after [i]
        val dec = IntArray(n)
        val inc = IntArray(n)
        for (i in 1 until n) {
            if (security[i] <= security[i - 1]) {
                dec[i] = dec[i - 1] + 1
            }
            // no need for else, because array elements are inited as 0
        }
        for (i in n - 2 downTo 0) {
            if (security[i] <= security[i + 1]) {
                inc[i] = inc[i + 1] + 1
            }
            // no need for else, because array elements are inited as 0
        }
        val res: MutableList<Int> = ArrayList()
        for (i in 0 until n) {
            if (dec[i] >= time && inc[i] >= time) {
                res.add(i)
            }
        }
        return res
    }
}
