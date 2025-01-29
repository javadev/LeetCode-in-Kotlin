package g0101_0200.s0189_rotate_array

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Math #Two_Pointers
// #Algorithm_I_Day_2_Two_Pointers #Udemy_Arrays #Top_Interview_150_Array/String
// #Big_O_Time_O(n)_Space_O(1) #2022_09_08_Time_483_ms_(86.95%)_Space_71.9_MB_(50.13%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun reverse(nums: IntArray, l: Int, r: Int) {
        var l = l
        var r = r
        while (l <= r) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
            r--
        }
    }

    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val t = n - k % n
        reverse(nums, 0, t - 1)
        reverse(nums, t, n - 1)
        reverse(nums, 0, n - 1)
    }
}
