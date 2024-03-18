package g0801_0900.s0852_peak_index_in_a_mountain_array

// #Medium #Array #Binary_Search #Binary_Search_I_Day_2
// #2023_03_30_Time_433_ms_(94.29%)_Space_49.4_MB_(100.00%)

class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        for (i in 1 until arr.size - 1) {
            if (arr[i] > arr[i + 1]) {
                return i
            }
        }
        return -1
    }
}
