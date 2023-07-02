package g0901_1000.s0905_sort_array_by_parity

// #Easy #Array #Sorting #Two_Pointers #2023_04_14_Time_219_ms_(75.00%)_Space_36.7_MB_(100.00%)

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var temp: Int
        var i = 0
        for (k in nums.indices) {
            if (nums[k] % 2 == 0) {
                temp = nums[k]
                nums[k] = nums[i]
                nums[i] = temp
                i++
            }
        }
        return nums
    }
}
