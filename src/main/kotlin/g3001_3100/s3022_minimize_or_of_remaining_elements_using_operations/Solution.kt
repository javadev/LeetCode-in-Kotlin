package g3001_3100.s3022_minimize_or_of_remaining_elements_using_operations

// #Hard #Array #Greedy #Bit_Manipulation #2024_02_29_Time_43_ms_(78.48%)_Space_56.6_MB_(23.73%)

class Solution {
    fun minOrAfterOperations(nums: IntArray, k: Int): Int {
        var ans = 0
        var mask = 0
        for (j in 30 downTo 0) {
            mask = mask or (1 shl j)
            var consecutiveAnd = mask
            var mergeCount = 0
            for (i in nums) {
                consecutiveAnd = consecutiveAnd and i
                if ((consecutiveAnd or ans) != ans) {
                    mergeCount++
                } else {
                    consecutiveAnd = mask
                }
            }
            if (mergeCount > k) {
                ans = ans or (1 shl j)
            }
        }
        return ans
    }
}
