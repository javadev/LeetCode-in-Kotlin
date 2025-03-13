package g1801_1900.s1825_finding_mk_average

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Queue
// #2025_03_13_Time_69_ms_(100.00%)_Space_98.49_MB_(100.00%)

import java.util.LinkedList
import java.util.TreeSet
import kotlin.math.abs
import kotlin.math.min

class MKAverage(private val capacity: Int, private val boundary: Int) {
    private val nums: IntArray = IntArray(100001)
    private val numSet: TreeSet<Int> = TreeSet<Int>()
    private val order: LinkedList<Int> = LinkedList<Int>()

    fun addElement(num: Int) {
        if (order.size == capacity) {
            val numToDelete = order.removeFirst()
            nums[numToDelete] = nums[numToDelete] - 1
            if (nums[numToDelete] == 0) {
                numSet.remove(numToDelete)
            }
        }
        nums[num]++
        numSet.add(num)
        order.add(num)
    }

    fun calculateMKAverage(): Int {
        if (order.size == capacity) {
            var skipCount = boundary
            var numsCount = capacity - 2 * boundary
            val freq = capacity - 2 * boundary
            var sum = 0
            for (num in numSet) {
                val count = nums[num]
                if (skipCount < 0) {
                    sum += num * min(count, numsCount)
                    numsCount = (numsCount - min(count, numsCount)).toInt()
                } else {
                    skipCount -= count
                    if (skipCount < 0) {
                        sum += num * min(abs(skipCount), numsCount)
                        numsCount = (numsCount - min(abs(skipCount), numsCount)).toInt()
                    }
                }
                if (numsCount == 0) {
                    break
                }
            }
            return sum / freq
        }
        return -1
    }
}

/*
 * Your MKAverage object will be instantiated and called as such:
 * var obj = MKAverage(m, k)
 * obj.addElement(num)
 * var param_2 = obj.calculateMKAverage()
 */
