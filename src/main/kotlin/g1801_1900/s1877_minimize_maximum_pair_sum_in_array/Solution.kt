package g1801_1900.s1877_minimize_maximum_pair_sum_in_array

// #Medium #Array #Sorting #Greedy #Two_Pointers
class Solution {
    fun minPairSum(nums: IntArray): Int {
        nums.sort()
        var start = 0
        var end = nums.size - 1
        var min = Int.MIN_VALUE
        while (start < end) {
            min = Math.max(min, nums[start] + nums[end])
            --end
            ++start
        }
        return min
    }
}
