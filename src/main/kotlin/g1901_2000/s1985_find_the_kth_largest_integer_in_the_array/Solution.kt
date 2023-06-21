package g1901_2000.s1985_find_the_kth_largest_integer_in_the_array

// #Medium #Array #String #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Quickselect
// #2023_06_21_Time_397_ms_(100.00%)_Space_55.3_MB_(66.67%)

import java.util.Arrays

class Solution {
    fun kthLargestNumber(nums: Array<String>, k: Int): String {
        Arrays.sort(nums) { n1: String, n2: String -> compareStringInt(n2, n1) }
        return nums[k - 1]
    }

    private fun compareStringInt(n1: String, n2: String): Int {
        if (n1.length != n2.length) {
            return if (n1.length < n2.length) -1 else 1
        }
        for (i in 0 until n1.length) {
            val n1Digit = n1[i].code - '0'.code
            val n2Digit = n2[i].code - '0'.code
            if (n1Digit > n2Digit) {
                return 1
            } else if (n2Digit > n1Digit) {
                return -1
            }
        }
        return 0
    }
}
