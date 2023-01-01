package g0401_0500.s0480_sliding_window_median

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2023_01_01_Time_409_ms_(100.00%)_Space_44.6_MB_(81.48%)

import java.util.TreeSet

class Solution {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
        require(k >= 1) { "Input is invalid" }
        val len = nums.size
        val result = DoubleArray(len - k + 1)
        if (k == 1) {
            for (i in 0 until len) {
                result[i] = nums[i].toDouble()
            }
            return result
        }
        val comparator = Comparator { a: Int?, b: Int? ->
            if (nums[a!!] != nums[b!!]
            ) Integer.compare(nums[a], nums[b]) else Integer.compare(a, b)
        }
        val smallNums = TreeSet(comparator.reversed())
        val largeNums = TreeSet(comparator)
        for (i in 0 until len) {
            if (i >= k) {
                removeElement(smallNums, largeNums, i - k)
            }
            addElement(smallNums, largeNums, i)
            if (i >= k - 1) {
                result[i - (k - 1)] = getMedian(smallNums, largeNums, nums)
            }
        }
        return result
    }

    private fun addElement(smallNums: TreeSet<Int?>, largeNums: TreeSet<Int?>, idx: Int) {
        smallNums.add(idx)
        largeNums.add(smallNums.pollFirst()!!)
        if (smallNums.size < largeNums.size) {
            smallNums.add(largeNums.pollFirst())
        }
    }

    private fun removeElement(smallNums: TreeSet<Int?>, largeNums: TreeSet<Int?>, idx: Int) {
        if (largeNums.contains(idx)) {
            largeNums.remove(idx)
            if (smallNums.size == largeNums.size + 2) {
                largeNums.add(smallNums.pollFirst()!!)
            }
        } else {
            smallNums.remove(idx)
            if (smallNums.size < largeNums.size) {
                smallNums.add(largeNums.pollFirst())
            }
        }
    }

    private fun getMedian(smallNums: TreeSet<Int?>, largeNums: TreeSet<Int?>, nums: IntArray): Double {
        return if (smallNums.size == largeNums.size) {
            (nums[smallNums.first()!!].toDouble() + nums[largeNums.first()!!]) / 2
        } else nums[smallNums.first()!!].toDouble()
    }
}
