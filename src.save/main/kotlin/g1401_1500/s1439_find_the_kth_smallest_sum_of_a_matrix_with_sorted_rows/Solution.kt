package g1401_1500.s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows

// #Hard #Array #Binary_Search #Matrix #Heap_Priority_Queue
// #2023_06_07_Time_225_ms_(100.00%)_Space_38.5_MB_(100.00%)

import java.util.Objects
import java.util.TreeSet

@Suppress("kotlin:S6510")
class Solution {
    fun kthSmallest(mat: Array<IntArray>, k: Int): Int {
        val treeSet = TreeSet(
            Comparator { o1: IntArray, o2: IntArray ->
                if (o1[0] != o2[0]) {
                    return@Comparator o1[0] - o2[0]
                } else {
                    for (i in 1 until o1.size) {
                        if (o1[i] != o2[i]) {
                            return@Comparator o1[i] - o2[i]
                        }
                    }
                    return@Comparator 0
                }
            }
        )
        val m = mat.size
        val n = mat[0].size
        var sum = 0
        val entry = IntArray(m + 1)
        for (ints in mat) {
            sum += ints[0]
        }
        entry[0] = sum
        treeSet.add(entry)
        var count = 0
        while (count < k) {
            val curr: IntArray = treeSet.pollFirst() as IntArray
            count++
            if (count == k) {
                return Objects.requireNonNull(curr)[0]
            }
            for (i in 0 until m) {
                val next = Objects.requireNonNull(curr).copyOf(curr.size)
                if (curr[i + 1] + 1 < n) {
                    next[0] -= mat[i][curr[i + 1]]
                    next[0] += mat[i][curr[i + 1] + 1]
                    next[i + 1]++
                    treeSet.add(next)
                }
            }
        }
        return -1
    }
}
