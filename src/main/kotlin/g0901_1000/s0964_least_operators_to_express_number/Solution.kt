package g0901_1000.s0964_least_operators_to_express_number

// #Hard #Dynamic_Programming #Math #2023_05_05_Time_160_ms_(100.00%)_Space_35.9_MB_(100.00%)

class Solution {
    private val map: MutableMap<String, Int> = HashMap()
    private var x = 0
    fun leastOpsExpressTarget(x: Int, target: Int): Int {
        this.x = x
        return if (x == target) {
            0
        } else dfs(0, target.toLong()) - 1
    }

    // ax^0 + bx^1 + cx^2 +....
    // think it as base x problem
    private fun dfs(ex: Int, target: Long): Int {
        if (target == 0L) {
            return 0
        }
        if (ex > 40) {
            return 10000000
        }
        val state = "$ex,$target"
        if (map.containsKey(state)) {
            return map.getValue(state)
        }
        var res = Int.MAX_VALUE
        val mod = (target % x).toInt()
        if (mod == 0) {
            res = if (ex == 0) {
                // not use
                res.coerceAtMost(dfs(ex + 1, target))
            } else {
                // not use
                res.coerceAtMost(dfs(ex + 1, target / x))
            }
        } else {
            // division is needed
            if (ex == 0) {
                res = res.coerceAtMost(2 * mod + dfs(ex + 1, target - mod))
                res = res.coerceAtMost(2 * (x - mod) + dfs(ex + 1, target - mod + x))
            } else {
                res = res.coerceAtMost((ex - 1) * mod + dfs(ex + 1, (target - mod) / x))
                res = res.coerceAtMost((ex - 1) * (x - mod) + dfs(ex + 1, (target - mod + x) / x))
            }
        }
        map[state] = res
        return res
    }
}
