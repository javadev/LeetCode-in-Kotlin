package g0301_0400.s0373_find_k_pairs_with_smallest_sums

// #Medium #Array #Heap_Priority_Queue #Top_Interview_150_Heap
// #2022_11_22_Time_1809_ms_(80.95%)_Space_119.1_MB_(66.67%)

import java.util.PriorityQueue

class Solution {
    private class Node(index: Int, num1: Int, num2: Int) {
        var sum: Long
        var al: MutableList<Int>
        var index: Int

        init {
            sum = num1.toLong() + num2.toLong()
            al = ArrayList()
            al.add(num1)
            al.add(num2)
            this.index = index
        }
    }

    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val queue = PriorityQueue { a: Node, b: Node -> if (a.sum < b.sum) -1 else 1 }
        val res: MutableList<List<Int>> = ArrayList()
        run {
            var i = 0
            while (i < nums1.size && i < k) {
                queue.add(Node(0, nums1[i], nums2[0]))
                i++
            }
        }
        var i = 1
        while (i <= k && queue.isNotEmpty()) {
            val cur = queue.poll()
            res.add(cur.al)
            val next = cur.index
            val lastNum1 = cur.al[0]
            if (next + 1 < nums2.size) {
                queue.add(Node(next + 1, lastNum1, nums2[next + 1]))
            }
            i++
        }
        return res
    }
}
