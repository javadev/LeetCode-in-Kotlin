package g0001_0100.s0001_two_sum

import java.util.Arrays

class Solution {
    fun twoSum(nums: IntArray?, target: Int): IntArray {
        if (nums == null || nums.size <= 1) {
            return IntArray(0)
        }
        val result = IntArray(2)
        var left = 0
        var right = nums.size - 1
        val nums1 = Arrays.copyOf(nums, nums.size)
        Arrays.sort(nums1)
        while (left < right) {
            if (nums1[left] + nums1[right] == target) {
                break
            } else if (nums1[left] + nums1[right] > target) {
                right--
            } else if (nums1[left] + nums1[right] < target) {
                left++
            }
        }
        for (i in nums.indices) {
            if (nums1[left] == nums[i]) {
                result[0] = i
                break
            }
        }
        for (j in nums.indices.reversed()) {
            if (nums1[right] == nums[j]) {
                result[1] = j
                break
            }
        }
        val tmp = result[0]
        result[0] = Math.min(result[0], result[1])
        result[1] = Math.max(tmp, result[1])
        return result
    }
}
