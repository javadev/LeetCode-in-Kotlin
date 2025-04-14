package g3501_3600.s3513_number_of_unique_xor_triplets_i

// #Medium #Array #Math #Bit_Manipulation #2025_04_13_Time_1_ms_(100.00%)_Space_89.00_MB_(100.00%)

class Solution {
    fun uniqueXorTriplets(nums: IntArray): Int {
        val n = nums.size
        return if (n < 3) n else Integer.highestOneBit(n) shl 1
    }
}
