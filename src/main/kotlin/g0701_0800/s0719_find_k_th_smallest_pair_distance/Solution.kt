package g0701_0800.s0719_find_k_th_smallest_pair_distance

// #Hard #Array #Sorting #Binary_Search #Two_Pointers
// #2023_02_27_Time_172_ms_(100.00%)_Space_37.2_MB_(100.00%)


class Solution {
    fun smallestDistancePair(nums: IntArray, k: Int): Int {
        nums.sort()
        val length = nums.size
        val maxDiff = nums[length - 1] - nums[0]
        var start = 0
        var end = maxDiff
        while (start < end) {
            val mid = start + (end - start) / 2
            if (isPair(nums, mid, k)) {
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
    }

    private fun isPair(nums: IntArray, mid: Int, k: Int): Boolean {
        var count = 0
        var i = 0
        for (j in 1 until nums.size) {
            while (nums[j] - nums[i] > mid) {
                i++
            }
            count += j - i
        }
        return count >= k
    }
}
