package g2101_2200.s2183_count_array_pairs_divisible_by_k

// #Hard #Array #Math #Number_Theory #2023_06_26_Time_756_ms_(100.00%)_Space_53.7_MB_(100.00%)

class Solution {
    fun countPairs(nums: IntArray, k: Int): Long {
        var count = 0L
        val map: MutableMap<Int, Long> = HashMap()
        for (num in nums) {
            val gd = gcd(num, k)
            val want = k / gd
            for ((key, value) in map) {
                if (key % want == 0) {
                    count += value
                }
            }
            map[gd] = map.getOrDefault(gd, 0L) + 1L
        }
        return count
    }

    private fun gcd(a: Int, b: Int): Int {
        if (a > b) {
            return gcd(b, a)
        }
        return if (a == 0) {
            b
        } else {
            gcd(a, b % a)
        }
    }
}
