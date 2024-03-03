package g3001_3100.s3024_type_of_triangle

// #Easy #Array #Math #Sorting #2024_02_29_Time_0_ms_(100.00%)_Space_41.6_MB_(95.74%)

class Solution {
    fun triangleType(nums: IntArray): String {
        if (nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[2] + nums[0] > nums[1]) {
            return if (nums[0] == nums[1] && nums[1] == nums[2]) {
                "equilateral"
            } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[2] == nums[1]) {
                "isosceles"
            } else {
                "scalene"
            }
        }
        return "none"
    }
}
