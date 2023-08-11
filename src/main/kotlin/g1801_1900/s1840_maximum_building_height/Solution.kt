package g1801_1900.s1840_maximum_building_height

// #Hard #Array #Math #2023_06_22_Time_1210_ms_(100.00%)_Space_118.6_MB_(100.00%)

class Solution {
    fun maxBuilding(n: Int, restrictions: Array<IntArray>): Int {
        if (restrictions.isEmpty()) {
            return n - 1
        }
        val m = restrictions.size
        restrictions.sortWith(compareBy { a: IntArray -> a[0] })
        for (i in m - 2 downTo 0) {
            restrictions[i][1] =
                restrictions[i][1].coerceAtMost(restrictions[i + 1][1] + restrictions[i + 1][0] - restrictions[i][0])
        }
        var id = 1
        var height = 0
        var res = 0
        for (r in restrictions) {
            var currMax: Int
            if (r[1] >= height + r[0] - id) {
                currMax = height + r[0] - id
                height = currMax
            } else {
                currMax = (height + r[0] - id + r[1]) / 2
                height = r[1]
            }
            id = r[0]
            res = res.coerceAtLeast(currMax)
        }
        if (id != n) {
            res = res.coerceAtLeast(height + n - id)
        }
        return res
    }
}
