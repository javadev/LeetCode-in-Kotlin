package g0401_0500.s0496_next_greater_element_i

// #Easy #Array #Hash_Table #Stack #Monotonic_Stack #Programming_Skills_I_Day_5_Function
// #2023_01_04_Time_171_ms_(100.00%)_Space_36.5_MB_(89.36%)

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val indexMap: MutableMap<Int, Int> = HashMap()
        for (i in nums2.indices) {
            indexMap[nums2[i]] = i
        }
        for (i in nums1.indices) {
            val num = nums1[i]
            var index = indexMap[num]!!
            if (index == nums2.size - 1) {
                nums1[i] = -1
            } else {
                var found = false
                while (index < nums2.size) {
                    if (nums2[index] > num) {
                        nums1[i] = nums2[index]
                        found = true
                        break
                    }
                    index++
                }
                if (!found) {
                    nums1[i] = -1
                }
            }
        }
        return nums1
    }
}
