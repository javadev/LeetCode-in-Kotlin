package g3901_4000.s3925_concatenate_array_with_reverse

// #Easy #Array #Simulation #Mid_Level #Weekly_Contest_501
// #2026_09_29_Time_1_ms_(97.85%)_Space_47.45_MB_(24.79%)

class Solution {
    fun concatWithReverse(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n * 2)
        var count = 0
        for (i in 0..<n) {
            ans[i] = nums[i]
            count++
        }
        for (i in n - 1 downTo 0) {
            ans[count++] = nums[i]
        }
        return ans
    }
}
