package g3901_4000.s3920_maximize_fixed_points_after_deletions

// #Hard #Array #Sorting #Binary_Search #Senior_Staff #Weekly_Contest_500
// #2026_09_16_Time_19_ms_(100.00%)_Space_124.05_MB_(97.30%)

class Solution {
    fun maxFixedPoints(nums: IntArray): Int {
        val n = nums.size
        val arr = LongArray(n)
        var index = 0
        for (i in 0..<n) {
            if (nums[i] <= i) {
                arr[index++] = i.toLong() - nums[i] shl 32 or nums[i].toLong()
            }
        }
        if (index == 0) {
            return 0
        }
        arr.sort(0, index)
        var max = 0
        val lis = IntArray(index)
        lis[0] = arr[0].toInt()
        for (i in 1..<index) {
            val `val` = arr[i].toInt()
            lis[if (`val` > lis[max]) ++max else binarySearch(lis, `val`, max)] = `val`
        }
        return max + 1
    }

    private fun binarySearch(arr: IntArray, target: Int, right: Int): Int {
        var right = right
        var left = 0
        while (left < right) {
            val mid = left + right ushr 1
            if (arr[mid] >= target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}
