package g0201_0300.s0239_sliding_window_maximum

import java.util.LinkedList

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Heap_Priority_Queue
// #Sliding_Window #Queue #Monotonic_Queue #Udemy_Arrays
// #2022_07_04_Time_58_ms_(52.28%)_Space_145_MB_(50.60%)
class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val res = IntArray(n - k + 1)
        var x = 0
        val dq = LinkedList<Int>()
        var i = 0
        var j = 0
        while (j < nums.size) {
            while (!dq.isEmpty() && dq.peekLast() < nums[j]) {
                dq.pollLast()
            }
            dq.addLast(nums[j])
            if (j - i + 1 == k) {
                res[x] = dq.peekFirst()
                ++x
                if (dq.peekFirst() == nums[i]) {
                    dq.pollFirst()
                }
                ++i
            }
            ++j
        }
        return res
    }
}
