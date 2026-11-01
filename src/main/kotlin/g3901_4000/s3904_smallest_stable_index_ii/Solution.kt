package g3901_4000.s3904_smallest_stable_index_ii

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_498
// #2026_09_17_Time_3_ms_(92.71%)_Space_133.24_MB_(29.87%)

class Solution {
    fun firstStableIndex(nums: IntArray, k: Int): Int {
        val n = nums.size
        val mini = IntArray(n)
        var mint = Int.MAX_VALUE
        for (i in n - 1 downTo 0) {
            if (nums[i] < mint) {
                mint = nums[i]
            }
            mini[i] = mint
        }
        var maxt = 0
        for (i in 0..<n) {
            if (nums[i] > maxt) {
                maxt = nums[i]
            }
            if (maxt - mini[i] <= k) {
                return i
            }
        }
        return -1
    }
}
