package g0801_0900.s0845_longest_mountain_in_array

// #Medium #Array #Dynamic_Programming #Two_Pointers #Enumeration
// #2023_03_29_Time_222_ms_(100.00%)_Space_38.4_MB_(16.67%)

class Solution {
    fun longestMountain(arr: IntArray): Int {
        var s = 0
        var i = 1
        while (i < arr.size - 1) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                var j = i
                var tem = 1
                while (j > 0 && arr[j] > arr[j - 1]) {
                    j--
                    tem++
                }
                j = i
                while (j < arr.size - 1 && arr[j] > arr[j + 1]) {
                    j++
                    tem++
                }
                s = s.coerceAtLeast(tem)
                i = j
            }
            i++
        }
        return s
    }
}
