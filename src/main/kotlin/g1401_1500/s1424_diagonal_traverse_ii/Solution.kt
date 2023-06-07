package g1401_1500.s1424_diagonal_traverse_ii

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2023_06_07_Time_706_ms_(100.00%)_Space_68.3_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Objects

class Solution {
    fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
        val ans: MutableList<Int> = ArrayList()
        val queue = ArrayDeque<Iterator<Int>>()
        var pos = 0
        do {
            if (pos < nums.size) {
                queue.offerFirst(nums[pos].iterator())
            }
            var sz = queue.size
            while (--sz >= 0) {
                val cur = queue.poll()
                ans.add(Objects.requireNonNull(cur).next())
                if (cur.hasNext()) {
                    queue.offer(cur)
                }
            }
            pos++
        } while (!queue.isEmpty() || pos < nums.size)
        return ans.stream().mapToInt { o: Int? -> o!! }.toArray()
    }
}
