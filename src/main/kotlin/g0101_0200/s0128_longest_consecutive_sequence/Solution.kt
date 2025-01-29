package g0101_0200.s0128_longest_consecutive_sequence

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Union_Find
// #Top_Interview_150_Hashmap #Big_O_Time_O(N_log_N)_Space_O(1)
// #2022_09_03_Time_460_ms_(97.77%)_Space_51_MB_(99.32%)

import java.util.PriorityQueue

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        val queue = PriorityQueue<Int>()
        nums.forEach {
            queue.add(it)
        }
        var lastNum = Integer.MIN_VALUE
        var length = 0
        var maxLength = 1
        while (queue.isNotEmpty()) {
            val num = queue.poll()
            if (num == lastNum) {
                continue
            }
            length++
            if (num - lastNum > 1) {
                length = 1
            }
            lastNum = num
            maxLength = maxOf(maxLength, length)
        }
        return maxLength
    }
}
