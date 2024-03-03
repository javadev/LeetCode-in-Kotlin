package g3001_3100.s3024_type_of_triangle

// #Easy #Array #Math #Sorting #2024_03_03_Time_163_ms_(81.03%)_Space_34.7_MB_(93.10%)

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
