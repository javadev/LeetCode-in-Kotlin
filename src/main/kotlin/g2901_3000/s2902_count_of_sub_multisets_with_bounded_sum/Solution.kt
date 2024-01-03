package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2024_01_03_Time_263_ms_(87.50%)_Space_41.5_MB_(37.50%)

import kotlin.math.min

@Suppress("NAME_SHADOWING")
class Solution {
    private val mod = 1000000007
    private val intMap = IntMap()

    fun countSubMultisets(nums: List<Int>, l: Int, r: Int): Int {
        intMap.clear()
        intMap.add(0)
        var total = 0
        for (num in nums) {
            intMap.add(num)
            total += num
        }
        if (total < l) {
            return 0
        }
        val r = min(r, total)
        val cnt = IntArray(r + 1)
        cnt[0] = intMap.map[0]
        var sum = 0
        for (i in 1 until intMap.size) {
            val value = intMap.vals[i]
            val count = intMap.map[value]
            if (count > 0) {
                sum = min(r, sum + value * count)
                update(cnt, value, count, sum)
            }
        }
        var res = 0
        for (i in l..r) {
            res = (res + cnt[i]) % mod
        }
        return res
    }

    private fun update(cnt: IntArray, n: Int, count: Int, sum: Int) {
        if (count == 1) {
            for (i in sum downTo n) {
                cnt[i] = (cnt[i] + cnt[i - n]) % mod
            }
        } else {
            for (i in n..sum) {
                cnt[i] = (cnt[i] + cnt[i - n]) % mod
            }
            val max = (count + 1) * n
            for (i in sum downTo max) {
                cnt[i] = (cnt[i] - cnt[i - max] + mod) % mod
            }
        }
    }

    private class IntMap {
        private val max = 20001
        val map = IntArray(max)
        val vals = IntArray(max)
        var size = 0

        fun add(v: Int) {
            if (map[v]++ == 0) {
                vals[size++] = v
            }
        }

        fun clear() {
            for (i in 0 until size) {
                map[vals[i]] = 0
            }
            size = 0
        }
    }
}
