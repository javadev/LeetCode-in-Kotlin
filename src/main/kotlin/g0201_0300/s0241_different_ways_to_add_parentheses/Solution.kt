package g0201_0300.s0241_different_ways_to_add_parentheses

// #Medium #String #Dynamic_Programming #Math #Recursion #Memoization
// #2022_10_27_Time_294_ms_(73.47%)_Space_35.1_MB_(91.84%)

class Solution {
    fun diffWaysToCompute(expression: String): List<Int> {
        return diffWayToCompute(expression, hashMapOf())
    }

    private fun diffWayToCompute(expression: String, hashMap: HashMap<String, List<Int>>): List<Int> {
        if (hashMap.containsKey(expression)) {
            return hashMap.getValue(expression)
        }
        val newList = arrayListOf<Int>()
        if (!hasOperatorInBetween(expression)) {
            newList.add(Integer.parseInt(expression))
        } else {
            for ((index, _) in expression.withIndex()) {
                val operator = expression[index]
                if (!Character.isDigit(operator)) {
                    val leftExpression = diffWayToCompute(expression.substring(0, index), hashMap)
                    val rightExpression = diffWayToCompute(expression.substring(index + 1), hashMap)
                    for (l in leftExpression) {
                        for (r in rightExpression) {
                            when (operator) {
                                '+' -> newList.add(l + r)
                                '-' -> newList.add(l - r)
                                '*' -> newList.add(l * r)
                            }
                        }
                    }
                }
            }
        }
        hashMap[expression] = newList
        return newList
    }

    private fun hasOperatorInBetween(expression: String): Boolean {
        for ((index, _) in expression.withIndex()) {
            when (expression[index]) {
                '+' -> return true
                '-' -> return true
                '*' -> return true
            }
        }
        return false
    }
}
