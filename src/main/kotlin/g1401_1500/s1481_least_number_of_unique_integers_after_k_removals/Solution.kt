package g1401_1500.s1481_least_number_of_unique_integers_after_k_removals

// #Medium #Array #Hash_Table #Sorting #Greedy #Counting
@Suppress("NAME_SHADOWING")
class Solution {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        var k = k
        val count: MutableMap<Int, Int> = HashMap()
        for (a in arr) {
            count[a] = 1 + count.getOrDefault(a, 0)
        }
        var remaining = count.size
        var occur = 1
        val occurrenceCount = IntArray(arr.size + 1)
        for (v in count.values) {
            ++occurrenceCount[v]
        }
        while (k > 0) {
            if (k - occur * occurrenceCount[occur] >= 0) {
                k -= occur * occurrenceCount[occur]
                remaining -= occurrenceCount[occur++]
            } else {
                return remaining - k / occur
            }
        }
        return remaining
    }
}
