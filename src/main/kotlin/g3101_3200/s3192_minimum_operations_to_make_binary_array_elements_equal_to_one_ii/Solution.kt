package g3101_3200.s3192_minimum_operations_to_make_binary_array_elements_equal_to_one_ii

// #Medium #Array #Dynamic_Programming #Greedy
// #2024_06_29_Time_684_ms_(64.29%)_Space_70.9_MB_(62.50%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var a = 0
        var c = 1
        for (x in nums) {
            if (x != c) {
                a++
                c = c xor 1
            }
        }
        return a
    }
}
