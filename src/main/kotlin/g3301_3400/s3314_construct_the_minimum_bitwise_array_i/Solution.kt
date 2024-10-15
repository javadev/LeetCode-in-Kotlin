package g3301_3400.s3314_construct_the_minimum_bitwise_array_i

// #Easy #Array #Bit_Manipulation #2024_10_15_Time_226_ms_(57.14%)_Space_38_MB_(25.71%)

class Solution {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val l = nums.size
        val r = IntArray(l)
        for (i in 0 until l) {
            r[i] = check(nums[i])
        }
        return r
    }

    private fun check(v: Int): Int {
        if (v % 2 == 0) {
            return -1
        }
        for (j in 1 until v) {
            if ((j or (j + 1)) == v) {
                return j
            }
        }
        return -1
    }
}
