package g2601_2700.s2657_find_the_prefix_common_array_of_two_arrays

// #Medium #Array #Hash_Table #2023_07_21_Time_288_ms_(88.89%)_Space_39.9_MB_(100.00%)

class Solution {
    fun findThePrefixCommonArray(a: IntArray, b: IntArray): IntArray {
        val hsA = HashSet<Int>()
        val hsB = HashSet<Int>()
        val addedA = HashSet<Int>()
        val addedB = HashSet<Int>()
        val res = IntArray(a.size)
        for (i in a.indices) {
            val numA = a[i]
            val numB = b[i]
            hsA.add(numA)
            hsB.add(numB)
            if (i > 0) res[i] += res[i - 1] else res[i] = 0
            if (numA in hsB && numA !in addedB) {
                addedA.add(numA)
                res[i] += 1
            }
            if (numB in hsA && numB !in addedA) {
                addedB.add(numB)
                res[i] += 1
            }
        }
        return res
    }
}
