package g0001_0100.s0041_first_missing_positive

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Udemy_Arrays
// #2023_07_05_Time_357_ms_(97.17%)_Space_50.7_MB_(90.57%)

class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        var noOne = true
        for (i in 0 until nums.size) {
            if (noOne && nums[i] == 1) {
                noOne = false
            } else if (nums[i] <= 0) {
                nums[i] = 1
            }
        }
        if (noOne) {
            return 1
        }
        var high = 0
        var k: Int
        for (x in nums) {
            k = kotlin.math.abs(x)
            high = kotlin.math.max(high, k)
            if (k - 1 < nums.size) {
                nums[k - 1] = -1 * kotlin.math.abs(nums[k - 1])
            }
        }
        for (i in nums.indices) {
            if (nums[i] > 0) {
                return i + 1
            }
        }
        return high + 1
    }
}
