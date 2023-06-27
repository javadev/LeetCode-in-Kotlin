package g1701_1800.s1775_equal_sum_arrays_with_minimum_number_of_operations

// #Medium #Array #Hash_Table #Greedy #Counting
// #2023_06_18_Time_529_ms_(100.00%)_Space_52.7_MB_(100.00%)

class Solution {
    fun minOperations(nums1: IntArray, nums2: IntArray): Int {
        val longer = if (nums1.size > nums2.size) nums1 else nums2
        val shorter = if (nums1.size > nums2.size) nums2 else nums1
        if (longer.size > shorter.size * 6) {
            return -1
        }
        longer.sort()
        shorter.sort()
        var i = 0
        var j = 0
        var diff = 0
        while (i < longer.size || j < shorter.size) {
            if (i < longer.size) {
                diff += longer[i++]
            }
            if (j < shorter.size) {
                diff -= shorter[j++]
            }
        }
        var minOps = 0
        i = 0
        j = shorter.size - 1
        return if (diff < 0) {
            while (diff < 0) {
                diff += if (i < longer.size && j >= 0) {
                    if (6 - longer[i] < shorter[j] - 1) {
                        shorter[j--] - 1
                    } else {
                        6 - longer[i++]
                    }
                } else if (i < longer.size) {
                    6 - longer[i++]
                } else {
                    shorter[j--] - 1
                }
                minOps++
            }
            minOps
        } else if (diff > 0) {
            i = longer.size - 1
            j = 0
            while (diff > 0) {
                diff -= if (i >= 0 && j < shorter.size) {
                    if (longer[i] - 1 > 6 - shorter[j]) {
                        longer[i--] - 1
                    } else {
                        6 - shorter[j++]
                    }
                } else if (i >= 0) {
                    longer[i--] - 1
                } else {
                    6 - shorter[j++]
                }
                minOps++
            }
            minOps
        } else {
            minOps
        }
    }
}
