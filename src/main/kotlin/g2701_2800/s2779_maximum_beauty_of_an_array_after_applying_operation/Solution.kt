package g2701_2800.s2779_maximum_beauty_of_an_array_after_applying_operation

// #Medium #Array #Sorting #Binary_Search #Sliding_Window
// #2023_08_09_Time_649_ms_(96.97%)_Space_58.8_MB_(81.82%)

class Solution {
    fun maximumBeauty(nums: IntArray, k: Int): Int {
        nums.sort()
        var i = 0
        val n = nums.size
        var j = 0
        while (j < n) {
            if (nums[j] - nums[i] > k * 2) {
                i++
            }
            ++j
        }
        return j - i
    }
}
