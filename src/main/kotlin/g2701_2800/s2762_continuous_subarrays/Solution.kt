package g2701_2800.s2762_continuous_subarrays

// #Medium #Array #Heap_Priority_Queue #Sliding_Window #Ordered_Set #Queue #Monotonic_Queue
// #2023_08_10_Time_492_ms_(100.00%)_Space_62.4_MB_(84.62%)

import java.util.TreeMap

class Solution {
    fun continuousSubarrays(nums: IntArray): Long {
        var left = 0
        var right = 0
        var total = 0L
        val tree = TreeMap<Int, Int>()
        val n = nums.size
        while (right < n) {
            if (!tree.containsKey(nums[right])) {
                tree[nums[right]] = 0
            }
            tree[nums[right]] = tree[nums[right]]!! + 1
            while (kotlin.math.abs(tree.lastKey() - nums[right]) > 2 || Math.abs(tree.firstKey() - nums[right]) > 2) {
                val keyL = nums[left]
                tree[keyL] = tree[keyL]!! - 1
                if (tree[keyL] == 0) tree.remove(keyL)
                left++
            }
            total += right - left + 1
            right++
        }
        return total
    }
}
