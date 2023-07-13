package g2601_2700.s2605_form_smallest_number_from_two_digit_arrays

// #Easy #Array #Hash_Table #Enumeration #2023_07_13_Time_161_ms_(100.00%)_Space_34.7_MB_(100.00%)

import java.util.HashSet

class Solution {
    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val set = HashSet<Int>()
        var (min, min1, min2) = arrayOf(10, 10, 10)
        for (num in nums1) {
            min1 = minOf(min1, num)
            set.add(num)
        }
        for (num in nums2) {
            min2 = minOf(min2, num)
            if (set.contains(num)) min = minOf(min, num)
        }
        if (min != 10) return min
        return minOf(min1, min2) * 10 + maxOf(min1, min2)
    }
}
