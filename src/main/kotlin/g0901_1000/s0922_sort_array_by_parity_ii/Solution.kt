package g0901_1000.s0922_sort_array_by_parity_ii

// #Easy #Array #Sorting #Two_Pointers #2023_04_17_Time_257_ms_(87.50%)_Space_39_MB_(87.50%)

class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        var i = 0
        var j = 1
        while (i < nums.size - 1 && j < nums.size) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                val tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
                i += 2
                j += 2
            }
            while (i < nums.size - 1 && nums[i] % 2 == 0) {
                i += 2
            }
            while (j < nums.size && nums[j] % 2 != 0) {
                j += 2
            }
        }
        return nums
    }
}
