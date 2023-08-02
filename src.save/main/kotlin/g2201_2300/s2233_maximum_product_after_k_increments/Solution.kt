package g2201_2300.s2233_maximum_product_after_k_increments

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2023_06_27_Time_766_ms_(100.00%)_Space_54.4_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumProduct(nums: IntArray, k: Int): Int {
        var k = k
        val pq = PriorityQueue<Int>()
        for (num in nums) {
            pq.add(num)
        }
        while (k-- > 0) {
            pq.add(pq.poll() + 1)
        }
        var ans: Long = 1
        val mod = 1000000007
        while (pq.isNotEmpty()) {
            ans = ans * pq.poll() % mod
        }
        return ans.toInt()
    }
}
