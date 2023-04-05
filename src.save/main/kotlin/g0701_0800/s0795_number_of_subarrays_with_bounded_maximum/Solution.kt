package g0701_0800.s0795_number_of_subarrays_with_bounded_maximum

// #Medium #Array #Two_Pointers #2023_03_14_Time_361_ms_(66.67%)_Space_44.8_MB_(100.00%)

class Solution {
    fun numSubarrayBoundedMax(arr: IntArray, left: Int, right: Int): Int {
        var ans = 0
        var si = 0
        var ei = 0
        var prev = 0
        while (ei < arr.size) {
            // if in range
            if (arr[ei] in left..right) {
                prev = ei - si + 1
                ans += prev
            } else if (arr[ei] < left) {
                ans += prev
            } else if (arr[ei] > right) {
                prev = 0
                si = ei + 1
            }
            ei++
        }
        return ans
    }
}
