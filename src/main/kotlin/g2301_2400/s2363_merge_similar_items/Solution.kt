package g2301_2400.s2363_merge_similar_items

// #Easy #Array #Hash_Table #Sorting #Ordered_Set
class Solution {
    fun mergeSimilarItems(arr1: Array<IntArray>, arr2: Array<IntArray>): List<List<Int>> {
        val cache = IntArray(1001)
        for (num in arr1) {
            cache[num[0]] += num[1]
        }
        for (num in arr2) {
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
