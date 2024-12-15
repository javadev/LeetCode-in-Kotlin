package g3301_3400.s3387_maximize_amount_after_two_days_of_conversions

// #Medium #2024_12_15_Time_13_ms_(100.00%)_Space_43.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    private var res = 0.0
    private var map1: MutableMap<String, MutableList<Pair>>? = null
    private var map2: MutableMap<String, MutableList<Pair>>? = null

    private class Pair(var tarcurr: String, var rate: Double)

    private fun solve(
        currCurrency: String,
        value: Double,
        targetCurrency: String?,
        day: Int,
        used: MutableSet<String?>,
    ) {
        if (currCurrency == targetCurrency) {
            res = max(res, value)
            if (day == 2) {
                return
            }
        }
        val list: MutableList<Pair> = if (day == 1) {
            map1!!.getOrDefault(currCurrency, ArrayList<Pair>())
        } else {
            map2!!.getOrDefault(currCurrency, ArrayList<Pair>())
        }
        for (p in list) {
            if (used.add(p.tarcurr)) {
                solve(p.tarcurr, value * p.rate, targetCurrency, day, used)
                used.remove(p.tarcurr)
            }
        }
        if (day == 1) {
            solve(currCurrency, value, targetCurrency, day + 1, HashSet<String?>())
        }
    }

    fun maxAmount(
        initialCurrency: String,
        pairs1: List<List<String>>,
        rates1: DoubleArray,
        pairs2: List<List<String>>,
        rates2: DoubleArray,
    ): Double {
        map1 = HashMap<String, MutableList<Pair>>()
        map2 = HashMap<String, MutableList<Pair>>()
        var size = pairs1.size
        for (i in 0..<size) {
            val curr = pairs1[i]
            val c1 = curr[0]
            val c2 = curr[1]
            if (!map1!!.containsKey(c1)) {
                map1!!.put(c1, ArrayList<Pair>())
            }
            map1!![c1]!!.add(Pair(c2, rates1[i]))
            if (!map1!!.containsKey(c2)) {
                map1!!.put(c2, ArrayList<Pair>())
            }
            map1!![c2]!!.add(Pair(c1, 1.0 / rates1[i]))
        }
        size = pairs2.size
        for (i in 0..<size) {
            val curr = pairs2[i]
            val c1 = curr[0]
            val c2 = curr[1]
            if (!map2!!.containsKey(c1)) {
                map2!!.put(c1, ArrayList<Pair>())
            }
            map2!![c1]!!.add(Pair(c2, rates2[i]))
            if (!map2!!.containsKey(c2)) {
                map2!!.put(c2, ArrayList<Pair>())
            }
            map2!![c2]!!.add(Pair(c1, 1.0 / rates2[i]))
        }
        res = 1.0
        solve(initialCurrency, 1.0, initialCurrency, 1, HashSet<String?>())
        return res
    }
}
