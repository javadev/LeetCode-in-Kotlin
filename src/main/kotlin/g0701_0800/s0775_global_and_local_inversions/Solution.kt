package g0701_0800.s0775_global_and_local_inversions

// #Medium #Array #Math #2023_03_10_Time_495_ms_(100.00%)_Space_51_MB_(100.00%)

class Solution {
    /*
     * from the above solution, we can tell that if we can find the minimum of A[j] where j >= i + 2,
     * then we could quickly return false, so two steps:
     * 1. remembering minimum
     * 2. scanning from right to left
     * <p>
     * Time: O(n)
     */
    fun isIdealPermutation(nums: IntArray): Boolean {
        var min = nums.size
        for (i in nums.size - 1 downTo 2) {
            min = min.coerceAtMost(nums[i])
            if (nums[i - 2] > min) {
                return false
            }
        }
        return true
    }
}
