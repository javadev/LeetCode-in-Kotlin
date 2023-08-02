package g2601_2700.s2654_minimum_number_of_operations_to_make_all_array_elements_equal_to_1

// #Medium #Array #Math #Number_Theory #2023_07_20_Time_172_ms_(100.00%)_Space_35.3_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var g = nums[0]
        var list = mutableListOf<Int>()
        var padding = 0
        var result = nums.size
        for (i in 0 until nums.size) {
            val n = nums[i]
            if (n == 1) {
                result--
            }
            g = gcd(g, n)
            if (i == nums.size - 1) continue
            val m = nums[i + 1]
            list.add(gcd(m, n))
        }
        if (g > 1) return -1
        while (!list.any { it == 1 }) {
            padding++
            val nlist = mutableListOf<Int>()
            for (i in 0 until list.size - 1) {
                val n = list[i]
                val m = list[i + 1]
                nlist.add(gcd(m, n))
            }
            list = nlist
        }
        return result + padding
    }

    private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
}
