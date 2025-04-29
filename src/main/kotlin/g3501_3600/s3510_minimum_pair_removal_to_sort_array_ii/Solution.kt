package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_29_Time_172_ms_(100.00%)_Space_85.64_MB_(66.67%)

import kotlin.math.ceil
import kotlin.math.ln
import kotlin.math.min
import kotlin.math.pow

class Solution {
    fun minimumPairRemoval(nums: IntArray): Int {
        if (nums.size == 1) {
            return 0
        }
        val size = 2.0.pow(ceil(ln(nums.size - 1.0) / ln(2.0))).toInt()
        val segment = LongArray(size * 2 - 1)
        segment.fill(Long.Companion.MAX_VALUE)
        val lefts = IntArray(size * 2 - 1)
        val rights = IntArray(size * 2 - 1)
        val sums = LongArray(nums.size)
        sums.fill(Long.Companion.MAX_VALUE / 2)
        val arrIdxToSegIdx: Array<IntArray> = Array(nums.size) { IntArray(0) }
        sums[0] = nums[0].toLong()
        var count = 0
        arrIdxToSegIdx[0] = intArrayOf(-1, size - 1)
        for (i in 1..<nums.size) {
            if (nums[i] < nums[i - 1]) {
                count++
            }
            lefts[size + i - 2] = i - 1
            rights[size + i - 2] = i
            segment[size + i - 2] = nums[i - 1] + nums[i].toLong()
            arrIdxToSegIdx[i] = intArrayOf(size + i - 2, size + i - 1)
            sums[i] = nums[i].toLong()
        }
        arrIdxToSegIdx[nums.size - 1][1] = -1
        for (i in size - 2 downTo 0) {
            val l = 2 * i + 1
            val r = 2 * i + 2
            segment[i] = min(segment[l], segment[r])
        }
        return getRes(count, segment, lefts, rights, sums, arrIdxToSegIdx)
    }

    private fun getRes(
        count: Int,
        segment: LongArray,
        lefts: IntArray,
        rights: IntArray,
        sums: LongArray,
        arrIdxToSegIdx: Array<IntArray>,
    ): Int {
        var count = count
        var res = 0
        while (count > 0) {
            var segIdx = 0
            while (2 * segIdx + 1 < segment.size) {
                val l = 2 * segIdx + 1
                val r = 2 * segIdx + 2
                segIdx = if (segment[l] <= segment[r]) {
                    l
                } else {
                    r
                }
            }
            val arrIdxL = lefts[segIdx]
            val arrIdxR = rights[segIdx]
            val numL = sums[arrIdxL]
            val numR = sums[arrIdxR]
            if (numL > numR) {
                count--
            }
            sums[arrIdxL] = sums[arrIdxL] + sums[arrIdxR]
            val newSum = sums[arrIdxL]
            val leftPointer = arrIdxToSegIdx[arrIdxL]
            val rightPointer = arrIdxToSegIdx[arrIdxR]
            val prvSegIdx = leftPointer[0]
            val nextSegIdx = rightPointer[1]
            leftPointer[1] = nextSegIdx
            if (prvSegIdx != -1) {
                val l = lefts[prvSegIdx]
                if (sums[l] > numL && sums[l] <= newSum) {
                    count--
                } else if (sums[l] <= numL && sums[l] > newSum) {
                    count++
                }
                modify(segment, prvSegIdx, sums[l] + newSum)
            }
            if (nextSegIdx != -1) {
                val r = rights[nextSegIdx]
                if (numR > sums[r] && newSum <= sums[r]) {
                    count--
                } else if (numR <= sums[r] && newSum > sums[r]) {
                    count++
                }
                modify(segment, nextSegIdx, newSum + sums[r])
                lefts[nextSegIdx] = arrIdxL
            }
            modify(segment, segIdx, Long.Companion.MAX_VALUE)
            res++
        }
        return res
    }

    private fun modify(segment: LongArray, idx: Int, num: Long) {
        var idx = idx
        if (segment[idx] == num) {
            return
        }
        segment[idx] = num
        while (idx != 0) {
            idx = (idx - 1) / 2
            val l = 2 * idx + 1
            val r = 2 * idx + 2
            segment[idx] = min(segment[l], segment[r])
        }
    }
}
