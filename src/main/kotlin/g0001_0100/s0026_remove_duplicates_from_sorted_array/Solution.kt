package g0001_0100.s0026_remove_duplicates_from_sorted_array

// #Easy #Top_Interview_Questions #Array #Two_Pointers #Udemy_Two_Pointers
// #Top_Interview_150_Array/String #2023_07_03_Time_249_ms_(67.38%)_Space_42_MB_(57.99%)

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
