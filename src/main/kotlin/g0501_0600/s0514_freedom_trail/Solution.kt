package g0501_0600.s0514_freedom_trail

// #Hard #String #Dynamic_Programming #Depth_First_Search #Breadth_First_Search
// #2023_01_12_Time_182_ms_(100.00%)_Space_35.6_MB_(100.00%)

class Solution {
    fun findRotateSteps(ring: String, key: String): Int {
        val indexs: Array<MutableList<Int>?> = arrayOfNulls<MutableList<Int>?>(26)
        for (i in 0 until ring.length) {
            val num = ring[i].code - 'a'.code
            if (indexs[num] == null) {
                indexs[num] = ArrayList()
            }
            indexs[num]!!.add(i)
        }
        val dp = Array(101) { IntArray(101) }
        return find(ring, 0, key, 0, dp, indexs)
    }

    private fun find(
        ring: String,
        i: Int,
        key: String,
        j: Int,
        cache: Array<IntArray>,
        indexs: Array<MutableList<Int>?>,
    ): Int {
        if (j == key.length) {
            return 0
        }
        if (cache[i][j] != 0) {
            return cache[i][j]
        }
        var ans = Int.MAX_VALUE
        val targets: List<Int>? = indexs[key[j].code - 'a'.code]
        for (t in targets!!) {
            var delta = Math.abs(i - t)
            delta = Math.min(delta, Math.abs(ring.length - delta))
            ans = Math.min(ans, 1 + delta + find(ring, t, key, j + 1, cache, indexs))
        }
        cache[i][j] = ans
        return ans
    }
}
