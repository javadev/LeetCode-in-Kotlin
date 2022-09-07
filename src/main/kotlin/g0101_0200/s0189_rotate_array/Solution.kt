package g0101_0200.s0189_rotate_array

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Math #Two_Pointers
// #Algorithm_I_Day_2_Two_Pointers #Udemy_Arrays
// #2022_09_07_Time_691_ms_(44.85%)_Space_73_MB_(27.44%)

class Solution {
    /**
     * using an extra array of the same size to copy it
     * O(n) time
     * O(n) space
     */
    fun rotate(nums: IntArray, k: Int) {
        val len = nums.size
        val tmp = IntArray(len)
        for (i in 0 until len) {
            tmp[(i + k) % len] = nums[i]
        }
        for (i in 0 until len) {
            nums[i] = tmp[i]
        }
    }
}
