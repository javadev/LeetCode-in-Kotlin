package g3101_3200.s3164_find_the_number_of_good_pairs_ii

// #Medium #Array #Hash_Table #2024_06_03_Time_1175_ms_(90.00%)_Space_75_MB_(65.00%)

class Solution {
    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Long {
        val hm = HashMap<Int, Int>()
        var ans: Long = 0
        for (`val` in nums2) {
            hm[`val` * k] = hm.getOrDefault(`val` * k, 0) + 1
        }
        for (index in nums1.indices) {
            if (nums1[index] % k != 0) {
                continue
            }
            var factor = 1
            while (factor * factor <= nums1[index]) {
                if (nums1[index] % factor != 0) {
                    factor++
                    continue
                }
                val factor1 = factor
                val factor2 = nums1[index] / factor
                if (hm.containsKey(factor1)) {
                    ans += hm[factor1]!!.toLong()
                }
                if (factor1 != factor2 && hm.containsKey(factor2)) {
                    ans += hm[factor2]!!.toLong()
                }
                factor++
            }
        }
        return ans
    }
}
