package g3201_3300.s3209_number_of_subarrays_with_and_value_of_k

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2024_07_09_Time_7_ms_(100.00%)_Space_62.9_MB_(11.74%)

class Solution {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        var ans: Long = 0
        var left = 0
        var right = 0
        for (i in nums.indices) {
            val x = nums[i]
            var j = i - 1
            while (j >= 0 && (nums[j] and x) != nums[j]) {
                nums[j] = nums[j] and x
                j--
            }
            while (left <= i && nums[left] < k) {
                left++
            }
            while (right <= i && nums[right] <= k) {
                right++
            }
            ans += (right - left).toLong()
        }
        return ans
    }
}
