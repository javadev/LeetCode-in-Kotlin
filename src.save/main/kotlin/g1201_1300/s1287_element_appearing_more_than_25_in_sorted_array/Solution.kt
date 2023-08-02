package g1201_1300.s1287_element_appearing_more_than_25_in_sorted_array

// #Easy #Array #2023_06_08_Time_199_ms_(100.00%)_Space_38.7_MB_(33.33%)

class Solution {
    fun findSpecialInteger(arr: IntArray): Int {
        val quarter = arr.size / 4
        for (i in 0 until arr.size - quarter) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i]
            }
        }
        return -1
    }
}
