package g0201_0300.s0241_different_ways_to_add_parentheses

// #Medium #String #Dynamic_Programming #Math #Recursion #Memoization
// #2022_07_05_Time_3_ms_(70.81%)_Space_42.5_MB_(73.65%)
@Suppress("kotlin:S108")
class Solution {
    fun diffWaysToCompute(expression: String): List<Int> {
        return diffWaysToCompute(expression, HashMap())
    }

    private fun diffWaysToCompute(expression: String, map: MutableMap<String, List<Int>>): List<Int> {
        if (map.containsKey(expression)) {
            return map[expression]!!
        }
        val values: MutableList<Int> = ArrayList()
        if (!hasOperator(expression)) {
            // base case
            values.add(expression.toInt())
        } else {
            // Recursive case. DFS
            for (i in 0 until expression.length) {
                val symbol = expression[i]
                if (!Character.isDigit(symbol)) {
                    val left = diffWaysToCompute(expression.substring(0, i), map)
                    val right = diffWaysToCompute(expression.substring(i + 1), map)
                    for (l in left) {
                        for (r in right) {
                            when (symbol) {
                                '+' -> values.add(l + r)
                                '-' -> values.add(l - r)
                                '*' -> values.add(l * r)
                                else -> {}
                            }
                        }
                    }
                }
            }
        }
        map[expression] = values
        return values
    }

    private fun hasOperator(expression: String): Boolean {
        for (i in 0 until expression.length) {
            when (expression[i]) {
                '+', '-', '*' -> return true
                else -> {}
            }
        }
        return false
    }
}
