package g1001_1100.s1090_largest_values_from_labels

// #Medium #Array #Hash_Table #Sorting #Greedy #Counting
// #2023_06_02_Time_281_ms_(100.00%)_Space_41.9_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    private class Node(var `val`: Int, var label: Int)

    fun largestValsFromLabels(values: IntArray, labels: IntArray, numWanted: Int, useLimit: Int): Int {
        var numWanted = numWanted
        val maxHeap =
            PriorityQueue { a: Node, b: Node -> if (b.`val` != a.`val`) b.`val` - a.`val` else a.label - b.label }
        val n = values.size
        for (i in 0 until n) {
            maxHeap.offer(Node(values[i], labels[i]))
        }
        var ans = 0
        val labelAddedCount: HashMap<Int, Int> = HashMap()
        while (maxHeap.isNotEmpty() && numWanted > 0) {
            val cur = maxHeap.poll()
            if (labelAddedCount.containsKey(cur.label) &&
                labelAddedCount[cur.label]!! >= useLimit
            ) {
                continue
            }
            if (cur.`val` > 0) {
                ans += cur.`val`
                labelAddedCount[cur.label] = labelAddedCount.getOrDefault(cur.label, 0) + 1
                numWanted--
            }
        }
        return ans
    }
}
