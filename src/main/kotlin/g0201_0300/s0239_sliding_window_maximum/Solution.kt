package g0201_0300.s0239_sliding_window_maximum

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Heap_Priority_Queue
// #Sliding_Window #Queue #Monotonic_Queue #Udemy_Arrays #Big_O_Time_O(n*k)_Space_O(n+k)
// #2022_09_10_Time_1059_ms_(86.14%)_Space_113.7_MB_(65.35%)

import java.util.LinkedList

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val res = IntArray(n - k + 1)
        var x = 0
        val dq = LinkedList<Int>()
        var i = 0
        var j = 0
        while (j < nums.size) {
            while (dq.isNotEmpty() && dq.peekLast() < nums[j]) {
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
