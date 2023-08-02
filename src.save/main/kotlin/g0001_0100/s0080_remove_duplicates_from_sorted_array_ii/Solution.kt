package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii

// #Medium #Array #Two_Pointers #Udemy_Arrays
// #2023_07_10_Time_192_ms_(80.67%)_Space_37.2_MB_(62.67%)

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var k = 0
        var count = 0
        while (i < nums.size - 1) {
            ++count
            if (count <= 2) {
                nums[k++] = nums[i]
            }
            if (nums[i] != nums[i + 1]) {
                count = 0
                i++
                continue
            }
            i++
        }
        ++count
        if (count <= 2) {
            nums[k++] = nums[i]
        }
        return k
    }
}
