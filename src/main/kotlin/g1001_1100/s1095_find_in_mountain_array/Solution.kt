package g1001_1100.s1095_find_in_mountain_array

// #Hard #Array #Binary_Search #Interactive #2023_06_03_Time_173_ms_(100.00%)_Space_36.9_MB_(33.33%)

/*
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *     fun get(index: Int): Int {}
 *     fun length(): Int {}
 * }
 */

class Solution {
    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        val peakIndex = findPeak(mountainArr)
        if (target == mountainArr.get(peakIndex)) {
            return peakIndex
        }
        val leftResult = findInPeakLeft(target, peakIndex, mountainArr)
        return if (leftResult != -1) {
            leftResult
        } else findInPeakRight(target, peakIndex, mountainArr)
    }

    private fun findPeak(mountainArray: MountainArray): Int {
        val len: Int = mountainArray.length()
        var left = 0
        var right = len - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (mountainArray.get(mid) < mountainArray.get(mid + 1)) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun findInPeakLeft(target: Int, peakIndex: Int, mountainArray: MountainArray): Int {
        var leftIndex = 0
        var rightIndex = peakIndex - 1
        while (leftIndex < rightIndex) {
            val midIndex = leftIndex + (rightIndex - leftIndex) / 2
            if (target > mountainArray.get(midIndex)) {
                leftIndex = midIndex + 1
            } else {
                rightIndex = midIndex
            }
        }
        return if (target == mountainArray.get(leftIndex)) leftIndex else -1
    }

    private fun findInPeakRight(target: Int, peakIndex: Int, mountainArray: MountainArray): Int {
        var leftIndex = peakIndex + 1
        var rightIndex: Int = mountainArray.length() - 1
        while (leftIndex < rightIndex) {
            val midIndex = leftIndex + (rightIndex - leftIndex) / 2
            if (target < mountainArray.get(midIndex)) {
                leftIndex = midIndex + 1
            } else {
                rightIndex = midIndex
            }
        }
        return if (target == mountainArray.get(leftIndex)) leftIndex else -1
    }
}
