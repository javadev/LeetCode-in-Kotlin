package g3401_3500.s3478_choose_k_elements_with_maximum_sum

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2025_03_14_Time_171_ms_(95.45%)_Space_93.28_MB_(36.36%)

import java.util.PriorityQueue

class Solution {
    fun findMaxSum(nums1: IntArray, nums2: IntArray, k: Int): LongArray {
        val n = nums1.size
        val ans = LongArray(n)
        val ps = Array<Point>(n) { i -> Point(nums1[i], nums2[i], i) }
        ps.sortWith { p1: Point, p2: Point -> p1.x.compareTo(p2.x) }
        val pq = PriorityQueue<Int>()
        var s: Long = 0
        var i = 0
        while (i < n) {
            var j = i
            while (j < n && ps[j].x == ps[i].x) {
                ans[ps[j].i] = s
                j++
            }
            for (p in i..<j) {
                val cur = ps[p].y
                if (pq.size < k) {
                    pq.offer(cur)
                    s += cur.toLong()
                } else if (cur > pq.peek()!!) {
                    s -= pq.poll()!!.toLong()
                    pq.offer(cur)
                    s += cur.toLong()
                }
            }
            i = j
        }
        return ans
    }

    private class Point(var x: Int, var y: Int, var i: Int)
}
