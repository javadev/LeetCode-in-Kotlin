package g3501_3600.s3583_count_special_triplets

// #Medium #2025_06_16_Time_250_ms_(100.00%)_Space_62.22_MB_(100.00%)

class Solution {
    fun specialTriplets(nums: IntArray): Int {
        val mod = 1000000007
        var res = 0
        val left: MutableMap<Int, Int> = HashMap()
        val right: MutableMap<Int, Int> = HashMap()
        for (num in nums) {
            right.put(num, right.getOrDefault(num, 0) + 1)
        }
        for (num in nums) {
            right.put(num, right[num]!! - 1)
            val ci: Int = left.getOrDefault(num * 2, 0)
            val ck: Int = right.getOrDefault(num * 2, 0)
            res = (res + ci * ck) % mod
            left.put(num, left.getOrDefault(num, 0) + 1)
        }
        return res
    }
}
