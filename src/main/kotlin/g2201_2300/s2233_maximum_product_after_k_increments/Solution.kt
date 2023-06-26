package g2201_2300.s2233_maximum_product_after_k_increments

import java.util.PriorityQueue

// #Medium #Array #Greedy #Heap_Priority_Queue
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
        while (!pq.isEmpty()) {
            ans = ans * pq.poll() % mod
        }
        return ans.toInt()
    }
}
