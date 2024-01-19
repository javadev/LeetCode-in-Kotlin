package g2901_3000.s2963_count_the_number_of_good_partitions

// #Hard #Array #Hash_Table #Math #Combinatorics
// #2024_01_19_Time_600_ms_(100.00%)_Space_58.4_MB_(95.24%)

import kotlin.math.max

class Solution {
    fun numberOfGoodPartitions(nums: IntArray): Int {
        val mp: MutableMap<Int, Int> = HashMap()
        val n = nums.size
        for (i in 0 until n) {
            mp[nums[i]] = i
        }
        var i = 0
        var j = 0
        var cnt = 0
        while (i < n) {
            j = max(j, mp[nums[i]]!!)
            if (i == j) {
                cnt++
            }
            i++
        }
        var res = 1
        for (k in 1 until cnt) {
            res *= 2
            val mod = 1000000007
            res %= mod
        }
        return res
    }
}
