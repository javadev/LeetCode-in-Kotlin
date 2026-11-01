package g3801_3900.s3868_minimum_cost_to_equalize_arrays_using_swaps

// #Medium #Array #Hash_Table #Greedy #Counting #Senior #Biweekly_Contest_178
// #2026_07_28_Time_78_ms_(94.70%)_Space_151.84_MB_(77.48%)

class Solution {
    fun minCost(a: IntArray, b: IntArray): Int {
        val m: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        for (x in a) {
            m.merge(x, 1) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }
        }
        for (x in b) {
            m.merge(x, -1) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }
        }
        var res = 0
        for (v in m.values) {
            if (v!! % 2 != 0) {
                return -1
            }
            if (v > 0) {
                res += v / 2
            }
        }
        return res
    }
}
