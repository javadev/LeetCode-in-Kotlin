package g1201_1300.s1283_find_the_smallest_divisor_given_a_threshold

// #Medium #Array #Binary_Search #Binary_Search_II_Day_5
class Solution {
    fun smallestDivisor(nums: IntArray, threshold: Int): Int {
        var l = 1
        var r = 1000000
        while (l <= r) {
            val mid = l + (r - l) / 2
            if (helper(mid, nums) > threshold) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return l
    }

    private fun helper(mid: Int, nums: IntArray): Int {
        var res = 0
        for (num in nums) {
            res += (num + mid - 1) / mid
        }
        return res
    }
}
