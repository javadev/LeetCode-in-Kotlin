package g1001_1100.s1096_brace_expansion_ii

// #Hard #String #Breadth_First_Search #Stack #Backtracking
// #2023_06_05_Time_205_ms_(100.00%)_Space_37.8_MB_(100.00%)

class Solution {
    fun braceExpansionII(expression: String): List<String> {
        val res = flatten(expression)
        val sorted: List<String> = ArrayList(res)
        sorted.sort()
        return sorted
    }

    private fun flatten(expression: String): Set<String> {
        val res: MutableSet<String> = HashSet()
        // A temp set to store cartesian product results.
        var curSet: MutableSet<String> = HashSet()
        var idx = 0
        while (idx < expression.length) {
            if (expression[idx] == '{') {
                // end will be the index of matching "}"
                val end = findClosingBrace(expression, idx)
                val set = flatten(expression.substring(idx + 1, end))
                curSet = concatenateSet(curSet, set)
                idx = end + 1
            } else if (Character.isLowerCase(expression[idx])) {
                // Create set with single element
                val set: Set<String> = HashSet(
                    listOf(
                        expression[idx].toString()
                    )
                )
                curSet = concatenateSet(curSet, set)
                idx++
            } else if (expression[idx] == ',') {
                res.addAll(curSet)
                curSet.clear()
                idx++
            }
        }
        // Don't forget!
        res.addAll(curSet)
        return res
    }

    private fun concatenateSet(set1: Set<String>, set2: Set<String>): MutableSet<String> {
        if (set1.isEmpty() || set2.isEmpty()) {
            return if (set2.isNotEmpty()) HashSet(set2) else HashSet(set1)
        }
        val res: MutableSet<String> = HashSet()
        for (s1 in set1) {
            for (s2 in set2) {
                res.add(s1 + s2)
            }
        }
        return res
    }

    private fun findClosingBrace(expression: String, start: Int): Int {
        var count = 0
        var idx = start
        while (idx < expression.length) {
            if (expression[idx] == '{') {
                count++
            } else if (expression[idx] == '}') {
                count--
            }
            if (count == 0) {
                break
            }
            idx++
        }
        return idx
    }
}
