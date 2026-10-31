package g3801_3900.s3819_rotate_non_negative_elements // #Medium #Array #Simulation #Senior #Weekly_Contest_486
// #2026_06_09_Time_11_ms_(100.00%)_Space_265.42_MB_(74.38%)

class Solution {
    fun rotateElements(nums: IntArray, k: Int): IntArray {
        var k = k
        val n = nums.size
        var m = 0
        val a = IntArray(n)
        for (x in nums) {
            if (x >= 0) {
                a[m++] = x
            }
        }
        if (m == 0) {
            return nums
        }
        k %= m
        var j = 0
        for (i in 0..<n) {
            if (nums[i] >= 0) {
                val index = (j + k) % m
                nums[i] = a[index]
                j++
            }
        }
        return nums
    }
}
