package g3501_3600.s3583_count_special_triplets

// #Medium #2025_06_16_Time_263_ms_(100.00%)_Space_99.88_MB_(42.86%)

class Solution {
    fun specialTriplets(nums: IntArray): Int {
        val mod = 1_000_000_007
        var res = 0
        val left = mutableMapOf<Int, Int>()
        val right = mutableMapOf<Int, Int>()
        for (num in nums) {
            right[num] = right.getOrDefault(num, 0) + 1
        }
        for (num in nums) {
            right[num] = right[num]!! - 1
            val ci = left.getOrDefault(num * 2, 0)
            val ck = right.getOrDefault(num * 2, 0)
            res = ((res + 1L * ci * ck) % mod).toInt()
            left[num] = left.getOrDefault(num, 0) + 1
        }
        return res
    }
}
