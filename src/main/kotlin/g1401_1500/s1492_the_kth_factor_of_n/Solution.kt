package g1401_1500.s1492_the_kth_factor_of_n

// #Medium #Math #2023_06_13_Time_133_ms_(65.12%)_Space_33.2_MB_(81.40%)

class Solution {
    fun kthFactor(n: Int, k: Int): Int {
        val list: MutableList<Int> = ArrayList()
        for (i in 1..n) {
            if (n % i == 0) {
                list.add(i)
            }
        }
        return if (list.size >= k) list[k - 1] else -1
    }
}
