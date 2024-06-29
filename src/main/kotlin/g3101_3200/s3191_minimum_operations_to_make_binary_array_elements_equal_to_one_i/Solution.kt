package g3101_3200.s3191_minimum_operations_to_make_binary_array_elements_equal_to_one_i

// #Medium #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window #Queue
// #2024_06_29_Time_653_ms_(57.35%)_Space_73.6_MB_(30.88%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var ans = 0
        // Iterate through the array up to the third-last element
        for (i in 0 until nums.size - 2) {
            // If the current element is 0, perform an operation
            if (nums[i] == 0) {
                ans++
                // Flip the current element and the next two elements
                nums[i] = 1
                nums[i + 1] = if (nums[i + 1] == 0) 1 else 0
                nums[i + 2] = if (nums[i + 2] == 0) 1 else 0
            }
        }
        // Check the last two elements if they are 0, return -1 as they cannot be flipped
        for (i in nums.size - 2 until nums.size) {
            if (nums[i] == 0) {
                return -1
            }
        }
        return ans
    }
}
