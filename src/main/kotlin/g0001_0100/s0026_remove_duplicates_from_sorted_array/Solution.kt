package g0001_0100.s0026_remove_duplicates_from_sorted_array

// #Easy #Top_Interview_Questions #Array #Two_Pointers
// #2022_03_29_Time_361_ms_(77.19%)_Space_47.7_MB_(25.17%)

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val n = nums.size
        var i = 0
        var j = 1
        if (n <= 1) {
            return n
        }
        while (j <= n - 1) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j]
                i++
            }
            j++
        }
        return i + 1
    }
}
