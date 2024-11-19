package g0701_0800.s0710_random_pick_with_blacklist

// #Hard #Hash_Table #Math #Sorting #Binary_Search #Randomized
// #2023_02_24_Time_632_ms_(100.00%)_Space_63.3_MB_(100.00%)

import kotlin.random.Random

class Solution(n: Int, blacklist: IntArray) {
    private val map: MutableMap<Int, Int>
    private val upperLimit: Int

    init {
        map = HashMap()
        upperLimit = n - blacklist.size
        for (`val` in blacklist) {
            map[`val`] = -1
        }
        var j = n - 1
        for (`val` in blacklist) {
            if (`val` < upperLimit) {
                while (map.containsKey(j)) {
                    j--
                }
                map[`val`] = j
                j--
            }
        }
    }

    fun pick(): Int {
        val `val`: Int = Random.nextInt(upperLimit)
        return if (map.containsKey(`val`)) {
            map[`val`]!!
        } else {
            `val`
        }
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(n, blacklist)
 * var param_1 = obj.pick()
 */
