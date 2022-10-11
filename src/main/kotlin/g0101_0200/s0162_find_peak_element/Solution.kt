package g0101_0200.s0162_find_peak_element

// #Medium #Top_Interview_Questions #Array #Binary_Search #Algorithm_II_Day_2_Binary_Search
// #Binary_Search_II_Day_12 #2022_10_11_Time_297_ms_(53.85%)_Space_36.8_MB_(66.27%)

class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        while (start < end) {
            // This is done because start and end might be big numbers, so it might exceed the
            // integer limit.
            val mid = start + (end - start) / 2
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        return start
    }
}
