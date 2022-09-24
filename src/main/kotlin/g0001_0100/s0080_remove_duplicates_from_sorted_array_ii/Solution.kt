package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii

// #Medium #Array #Two_Pointers #Udemy_Arrays
// #2022_09_24_Time_357_ms_(44.78%)_Space_40.7_MB_(25.37%)

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
