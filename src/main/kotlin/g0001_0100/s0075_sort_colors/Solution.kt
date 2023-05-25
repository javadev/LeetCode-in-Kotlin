package g0001_0100.s0075_sort_colors

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting #Two_Pointers
// #Data_Structure_II_Day_2_Array #Udemy_Arrays
// #2022_08_31_Time_198_ms_(85.66%)_Space_34.8_MB_(84.84%)

class Solution {
    fun sortColors(nums: IntArray) {
        var zeroes = 0
        var ones = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                nums[zeroes++] = 0
            } else if (nums[i] == 1) {
                ones++
            }
        }
        for (j in zeroes until zeroes + ones) {
            nums[j] = 1
        }
        for (k in zeroes + ones until nums.size) {
            nums[k] = 2
        }
    }
}
