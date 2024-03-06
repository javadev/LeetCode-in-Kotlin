package g3001_3100.s3048_earliest_second_to_mark_indices_i

// #Medium #Array #Binary_Search #2024_03_06_Time_223_ms_(75.00%)_Space_44.7_MB_(33.33%)

class Solution {
    fun earliestSecondToMarkIndices(nums: IntArray, changeIndices: IntArray): Int {
        val n = nums.size
        if (nums.isEmpty() || changeIndices.isEmpty()) {
            return 0
        }
        val last = IntArray(n)
        last.fill(-1)
        for (i in changeIndices.indices) {
            changeIndices[i] -= 1
        }
        var low = 0
        var high = changeIndices.size - 1
        while (low < high) {
            val mid = low + (high - low) / 2
            if (isPossible(mid, nums, changeIndices, last)) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return if (isPossible(low, nums, changeIndices, last)) low + 1 else -1
    }

    private fun isPossible(s: Int, nums: IntArray, changeIndices: IntArray, last: IntArray): Boolean {
        val n = nums.size
        last.fill(-1)
        for (i in 0..s) {
            last[changeIndices[i]] = i
        }
        var marked = 0
        var operations = 0
        for (i in 0..s) {
            if (i == last[changeIndices[i]]) {
                if (nums[changeIndices[i]] > operations) {
                    return false
                }
                operations -= nums[changeIndices[i]]
                marked++
            } else {
                operations++
            }
        }
        return marked == n
    }
}
