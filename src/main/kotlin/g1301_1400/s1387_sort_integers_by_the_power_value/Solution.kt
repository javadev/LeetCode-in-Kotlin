package g1301_1400.s1387_sort_integers_by_the_power_value

import java.util.Arrays

// #Medium #Dynamic_Programming #Sorting #Memoization
class Solution {
    private lateinit var cacheMap: MutableMap<Int, Int>

    fun getKth(lo: Int, hi: Int, k: Int): Int {
        cacheMap = HashMap()
        cacheMap[1] = 0
        val arr = Array(hi - lo + 1) { IntArray(2) }
        for (i in arr.indices) {
            arr[i][0] = lo + i
            arr[i][1] = getStepCount(lo + i)
        }
        Arrays.sort(arr, Comparator.comparing { a: IntArray -> a[1] })
        return arr[k - 1][0]
    }

    private fun getStepCount(`val`: Int): Int {
        if (cacheMap!!.containsKey(`val`)) {
            return cacheMap!![`val`]!!
        }
        val step: Int
        step = if (`val` % 2 == 0) {
            // even
            1 + getStepCount(`val` / 2)
        } else {
            1 + getStepCount(3 * `val` + 1)
        }
        cacheMap!![`val`] = step
        return step
    }
}
