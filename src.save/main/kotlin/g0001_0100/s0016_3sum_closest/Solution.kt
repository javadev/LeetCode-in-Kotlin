package g0001_0100.s0016_3sum_closest

// #Medium #Array #Sorting #Two_Pointers #Level_2_Day_14_Sliding_Window/Two_Pointer
// #2023_07_03_Time_163_ms_(100.00%)_Space_37.5_MB_(92.24%)

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        if (nums.size < 3) {
            return 0
        }
        if (nums.size == 3) {
            return nums[0] + nums[1] + nums[2]
        }
        nums.sort()
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
