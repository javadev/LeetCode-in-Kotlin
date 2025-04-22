package g3501_3600.s3523_make_array_non_decreasing

// #Medium #Array #Greedy #Stack #Monotonic_Stack
// #2025_04_20_Time_4_ms_(75.00%)_Space_80.50_MB_(62.50%)

class Solution {
    fun maximumPossibleSize(nums: IntArray): Int {
        var res = 0
        var prev = Int.Companion.MIN_VALUE
        for (x in nums) {
            if (x >= prev) {
                res++
                prev = x
            }
        }
        return res
    }
}
