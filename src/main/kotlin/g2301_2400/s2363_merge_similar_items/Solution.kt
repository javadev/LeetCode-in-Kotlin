package g2301_2400.s2363_merge_similar_items

// #Easy #Array #Hash_Table #Sorting #Ordered_Set
// #2023_07_02_Time_320_ms_(100.00%)_Space_41.5_MB_(100.00%)

class Solution {
    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        val cache = IntArray(1001)
        for (num in items1) {
            cache[num[0]] += num[1]
        }
        for (num in items2) {
            cache[num[0]] += num[1]
        }
        val result: MutableList<List<Int>> = ArrayList()
        for (i in cache.indices) {
            val weight = cache[i]
            if (weight > 0) {
                result.add(listOf(i, weight))
            }
        }
        return result
    }
}
