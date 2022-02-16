package g0001_0100.s0018_4sum

import java.util.Arrays

// #Medium #Array #Sorting #Two_Pointers

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val list: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)
        val n = nums.size
        if (n == 0) {
            return list
        }
        for (a in 0 until n - 3) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue
            }
            for (d in n - 1 downTo a + 2 + 1) {
                if (d < n - 1 && nums[d] == nums[d + 1]) {
                    continue
                }
                var b = a + 1
                var c = d - 1
                val min = nums[a] + nums[d] + nums[b] + nums[b + 1]
                if (min > target) {
                    continue
                }
                val max = nums[a] + nums[d] + nums[c] + nums[c - 1]
                if (max < target) {
                    break
                }
                while (c > b) {
                    val sum = nums[a] + nums[b] + nums[c] + nums[d]
                    if (sum > target) {
                        c--
                    } else if (sum < target) {
                        b++
                    } else {
                        list.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]))
                        while (c > b && nums[b] == nums[b + 1]) {
                            b++
                        }
                        while (c > b && nums[c] == nums[c - 1]) {
                            c--
                        }
                        b++
                        c--
                    }
                }
            }
        }
        return list
    }
}
