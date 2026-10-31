package g3701_3800.s3774_absolute_difference_between_maximum_and_minimum_k_elements

// #Easy #Array #Sorting #Mid_Level #Weekly_Contest_480
// #2026_05_08_Time_5_ms_(96.82%)_Space_46.97_MB_(28.79%)

class Solution {
    fun absDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var maxSum = 0
        var minSum = 0
        var i = 0
        var j = nums.size - 1
        while (i < k) {
            minSum += nums[i]
            maxSum += nums[j]
            i++
            j--
        }
        return maxSum - minSum
    }
}
