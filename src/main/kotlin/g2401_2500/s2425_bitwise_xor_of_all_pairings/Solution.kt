package g2401_2500.s2425_bitwise_xor_of_all_pairings

// #Medium #Array #Bit_Manipulation #Brainteaser
// #2023_07_05_Time_424_ms_(100.00%)_Space_55.4_MB_(100.00%)

class Solution {
    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
        var xor = 0
        if (nums2.size % 2 == 1) {
            for (x in nums1) {
                xor = xor xor x
            }
        }
        if (nums1.size % 2 == 1) {
            for (x in nums2) {
                xor = xor xor x
            }
        }
        return xor
    }
}
