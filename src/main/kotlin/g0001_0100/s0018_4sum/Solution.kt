package g0001_0100.s0018_4sum

// #Medium #Array #Sorting #Two_Pointers #2022_03_29_Time_467_ms_(81.25%)_Space_44.4_MB_(82.81%)

import java.util.Arrays

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int?>?> {
        var list: MutableList<List<Int?>?> = ArrayList()
        var j: Int
        var k: Int
        var l: Int
        Arrays.sort(nums)
        var i: Int = 0
        while (i < nums.size - 3) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++
                continue
            }
            j = i + 1
            while (j < nums.size - 2) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++
                    continue
                }
                k = j + 1
                l = nums.size - 1
                while (k < l) {
                    val sum = nums[i] + nums[j] + nums[k] + nums[l]
                    if (sum == target) {
                        val l1 = ArrayList<Int?>()
                        l1.add(nums[i])
                        l1.add(nums[j])
                        l1.add(nums[k])
                        l1.add(nums[l])
                        list.add(l1)
                        l--
                        if (k < l && nums[l] == nums[l + 1]) {
                            l--
                        }
                    } else if (sum > target) {
                        l--
                    } else {
                        k++
                    }
                }
                j++
            }
            i++
        }
        list = ArrayList(LinkedHashSet(list))
        return list
    }
}
