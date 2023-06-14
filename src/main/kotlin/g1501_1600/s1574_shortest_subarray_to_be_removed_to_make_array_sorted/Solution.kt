package g1501_1600.s1574_shortest_subarray_to_be_removed_to_make_array_sorted

// #Medium #Array #Binary_Search #Two_Pointers #Stack #Monotonic_Stack #Binary_Search_II_Day_14
// #2023_06_14_Time_477_ms_(50.00%)_Space_55.9_MB_(100.00%)

class Solution {
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        var left = 0
        while (left < arr.size - 1 && arr[left] <= arr[left + 1]) {
            left++
        }
        if (left == arr.size - 1) {
            return 0
        }
        var right = arr.size - 1
        while (right > left && arr[right] >= arr[right - 1]) {
            right--
        }
        if (right == 0) {
            return arr.size - 1
        }
        var result = Math.min(arr.size - left - 1, right)
        var i = 0
        var j = right
        while (i <= left && j < arr.size) {
            if (arr[j] >= arr[i]) {
                result = Math.min(result, j - i - 1)
                i++
            } else {
                j++
            }
        }
        return result
    }
}
