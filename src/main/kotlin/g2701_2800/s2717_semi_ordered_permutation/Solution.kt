package g2701_2800.s2717_semi_ordered_permutation

// #Easy #Array #Simulation #2023_08_01_Time_186_ms_(100.00%)_Space_40.6_MB_(69.23%)

class Solution {
    fun semiOrderedPermutation(nums: IntArray): Int {
        val a = 1
        var b = nums.size
        var idxA = 0
        var idxB = 0
        for (i in nums.indices) {
            if (nums[i] == a) idxA = i
            if (nums[i] == b) idxB = i
        }
        b = b - idxB - 1
        return if (idxB < idxA) idxA + b - 1 else idxA + b
    }
}
