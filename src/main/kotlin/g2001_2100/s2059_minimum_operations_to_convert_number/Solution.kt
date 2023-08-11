package g2001_2100.s2059_minimum_operations_to_convert_number

// #Medium #Array #Breadth_First_Search #2023_06_25_Time_285_ms_(66.67%)_Space_38.6_MB_(66.67%)

class Solution {
    fun minimumOperations(nums: IntArray, start: Int, goal: Int): Int {
        val seen = BooleanArray(1001)
        var q = listOf(goal)
        var cnt = 0
        while (q.isNotEmpty()) {
            ++cnt
            val q1: MutableList<Int> = ArrayList()
            for (x in q) {
                for (n in nums) {
                    for (xn in intArrayOf(x + n, x - n, x xor n)) {
                        if (xn in 0..1000 && !seen[xn]) {
                            if (xn == start) {
                                return cnt
                            }
                            seen[xn] = true
                            q1.add(xn)
                        }
                    }
                }
                q = q1
            }
        }
        return -1
    }
}
