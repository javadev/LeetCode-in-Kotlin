package g2401_2500.s2438_range_product_queries_of_powers

// #Medium #Array #Bit_Manipulation #Prefix_Sum
// #2023_07_05_Time_1115_ms_(100.00%)_Space_94.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun productQueries(n: Int, queries: Array<IntArray>): IntArray {
        val length = queries.size
        val mod = (1e9 + 7).toLong()
        // convert n to binary form
        // take the set bit and find the corresponding 2^i
        // now answer for the query
        val powerTracker = IntArray(32)
        val productTakingPowers: MutableList<Long> = ArrayList()
        val result = IntArray(length)
        fillPowerTracker(powerTracker, n)
        fillProductTakingPowers(productTakingPowers, powerTracker)
        var index = 0
        for (query in queries) {
            val left = query[0]
            val right = query[1]
            var product: Long = 1
            for (i in left..right) {
                product = product * productTakingPowers[i] % mod
            }
            result[index++] = (product % mod).toInt()
        }
        return result
    }

    private fun fillPowerTracker(powerTracker: IntArray, n: Int) {
        var n = n
        var index = 0
        while (n > 0) {
            powerTracker[index++] = n and 1
            n = n shr 1
        }
    }

    private fun fillProductTakingPowers(productTakingPowers: MutableList<Long>, powerTracker: IntArray) {
        for (i in 0..31) {
            if (powerTracker[i] == 1) {
                val power = Math.pow(2.0, i.toDouble()).toLong()
                productTakingPowers.add(power)
            }
        }
    }
}
