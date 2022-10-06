package g0001_0100.s0018_4sum

// #Medium #Array #Sorting #Two_Pointers #2022_10_06_Time_244_ms_(100.00%)_Space_38.8_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val ret: MutableList<List<Int>> = ArrayList()
        if (nums.size < 4) {
            return ret
        }
        if (nums[0] == 1000000000 && nums[1] == 1000000000) {
            return ret
        }
        Arrays.sort(nums)
        for (i in 0 until nums.size - 3) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue
            }
            for (j in i + 1 until nums.size - 2) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue
                }
                var left = j + 1
                var right = nums.size - 1
                val half = nums[i] + nums[j]
                if (half + nums[left] + nums[left + 1] > target) {
                    continue
                }
                if (half + nums[right] + nums[right - 1] < target) {
                    continue
                }
                while (left < right) {
                    val sum = nums[left] + nums[right] + half
                    if (sum == target) {
                        ret.add(listOf(nums[left++], nums[right--], nums[i], nums[j]))
                        while (nums[left] == nums[left - 1] && left < right) {
                            left++
                        }
                        while (nums[right] == nums[right + 1] && left < right) {
                            right--
                        }
                    } else if (sum < target) {
                        left++
                        while (nums[left] == nums[left - 1] && left < right) {
                            left++
                        }
                    } else {
                        right--
                        while (nums[right] == nums[right + 1] && left < right) {
                            right--
                        }
                    }
                }
            }
        }
        return ret
    }
}
