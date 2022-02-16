package g0001_0100.s0016_3sum_closest

// #Medium #Array #Sorting #Two_Pointers

import java.util.Arrays

class Solution {
    fun threeSumClosest(nums: IntArray?, target: Int): Int {
        if (nums == null || nums.size < 3) {
            return 0
        }
        if (nums.size == 3) {
            return nums[0] + nums[1] + nums[2]
        }
        Arrays.sort(nums)
        val n = nums.size
        var sum = nums[0] + nums[1] + nums[2]
        for (i in 0 until n - 2) {
            if (nums[i] + nums[n - 1] + nums[n - 2] < target) {
                sum = nums[i] + nums[n - 1] + nums[n - 2]
                continue
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] > target) {
                val temp = nums[i] + nums[i + 1] + nums[i + 2]
                return lessGap(sum, temp, target)
            }
            var j = i + 1
            var k = n - 1
            while (j < k) {
                val temp = nums[i] + nums[j] + nums[k]
                if (temp == target) {
                    return target
                }
                if (temp < target) {
                    j++
                } else {
                    k--
                }
                sum = lessGap(sum, temp, target)
            }
        }
        return sum
    }

    private fun lessGap(sum: Int, temp: Int, target: Int): Int {
        return if (Math.abs(sum - target) < Math.abs(temp - target)) sum else temp
    }
}
