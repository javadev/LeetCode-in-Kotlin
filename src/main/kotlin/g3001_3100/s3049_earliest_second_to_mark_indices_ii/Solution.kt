package g3001_3100.s3049_earliest_second_to_mark_indices_ii

// #Hard #Array #Greedy #Binary_Search #Heap_Priority_Queue
// #2024_03_06_Time_220_ms_(100.00%)_Space_44.1_MB_(66.67%)

import java.util.PriorityQueue
import java.util.Queue
import kotlin.math.min

class Solution {
    private lateinit var nums: IntArray
    private lateinit var changeIndices: IntArray
    private lateinit var first: BooleanArray
    private var sum: Long = 0

    fun earliestSecondToMarkIndices(nums: IntArray, changeIndices: IntArray): Int {
        val m = changeIndices.size
        val n = nums.size
        if (m < n) {
            return -1
        }
        this.nums = nums
        this.changeIndices = changeIndices
        val set: MutableSet<Int> = HashSet()
        first = BooleanArray(m)
        for (i in 0 until m) {
            if (nums[changeIndices[i] - 1] > 1 && set.add(changeIndices[i])) {
                first[i] = true
            }
        }
        for (num in nums) {
            sum += num.toLong()
        }
        sum += n.toLong()
        var l = n
        var r = (min(sum.toInt(), m)) + 1
        while (l < r) {
            val mid = (l + r) / 2
            if (check(mid)) {
                r = mid
            } else {
                l = mid + 1
            }
        }
        return if (l > min(sum.toInt(), m)) -1 else l
    }

    private fun check(idx: Int): Boolean {
        val pq: Queue<Int> = PriorityQueue()
        var need = sum
        var count = 0
        var i = idx - 1
        while (i >= 0 && need > idx) {
            if (!first[i]) {
                count++
                i--
                continue
            }
            pq.add(nums[changeIndices[i] - 1])
            need -= (nums[changeIndices[i] - 1] - 1).toLong()
            if (pq.size > count) {
                need += (pq.poll() - 1).toLong()
                count++
            }
            i--
        }
        return need <= idx
    }
}
