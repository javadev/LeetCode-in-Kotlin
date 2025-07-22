package g3601_3700.s3623_count_number_of_trapezoids_i

// #Medium #Array #Hash_Table #Math #Geometry #Weekly_Contest_459
// #2025_07_22_Time_58_ms_(68.00%)_Space_139.38_MB_(8.00%)

class Solution {
    fun countTrapezoids(points: Array<IntArray>): Int {
        val mod = 1000000007
        val inv = 500000004L
        val map: MutableMap<Int, Int> = HashMap<Int, Int>(points.size)
        for (p in points) {
            map.merge(p[1], 1) { a: Int, b: Int -> Integer.sum(a, b) }
        }
        var sum = 0L
        var sumPairs = 0L
        for (num in map.values) {
            if (num > 1) {
                val pairs = (num.toLong() * (num - 1) / 2) % mod
                sum = (sum + pairs) % mod
                sumPairs = (sumPairs + pairs * pairs % mod) % mod
            }
        }
        var res = (sum * sum % mod - sumPairs + mod) % mod
        res = (res * inv) % mod
        return res.toInt()
    }
}
