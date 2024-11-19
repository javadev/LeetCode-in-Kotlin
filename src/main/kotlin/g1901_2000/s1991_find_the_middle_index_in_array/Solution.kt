package g1901_2000.s1991_find_the_middle_index_in_array

// #Easy #Array #Prefix_Sum #2023_06_21_Time_142_ms_(100.00%)_Space_34.5_MB_(100.00%)

class Solution {
    // TC : O(1), SC: (1)
    fun findMiddleIndex(nums: IntArray): Int {
        // find the sum of all numbers in the array
        var sum = 0
        for (n in nums) {
            sum += n
        }
        // consider leftSum = 0, rightSum = sum
        var leftSum = 0
        var rightSum = sum
        /*
         Traverse the array: At each index, subtract the element from rightSum and
         check if leftSum equals rightSum. If they do, return the index.
         Otherwise, add the number at current index to the leftSum and traverse further.
         */for (i in nums.indices) {
            rightSum -= nums[i]
            if (leftSum == rightSum) {
                return i
            }
            leftSum += nums[i]
        }
        // index not found, return -1
        return -1
    }
}
