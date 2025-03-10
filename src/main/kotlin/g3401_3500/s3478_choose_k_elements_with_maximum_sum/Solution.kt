package g3401_3500.s3478_choose_k_elements_with_maximum_sum

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2025_03_10_Time_238_ms_(100.00%)_Space_87.94_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun findMaxSum(nums1: IntArray, nums2: IntArray, k: Int): LongArray {
        val n = nums1.size
        val arr = Array<IntArray>(n) { IntArray(3) }
        for (i in 0..<n) {
            arr[i][0] = nums1[i]
            arr[i][1] = nums2[i]
            arr[i][2] = i
        }
        arr.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        val ans = LongArray(n)
        val pq = PriorityQueue<Int>()
        var sum: Long = 0
        for (i in 0..<n) {
            if (i > 0 && arr[i - 1][0] == arr[i][0]) {
                ans[arr[i][2]] = ans[arr[i - 1][2]]
            } else {
                ans[arr[i][2]] = sum
            }
            pq.add(arr[i][1])
            sum += arr[i][1].toLong()
            if (pq.size > k) {
                sum -= pq.remove()!!.toLong()
            }
        }
        return ans
    }
}
