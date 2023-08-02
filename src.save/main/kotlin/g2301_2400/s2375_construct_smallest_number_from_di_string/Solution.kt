package g2301_2400.s2375_construct_smallest_number_from_di_string

// #Medium #String #Greedy #Stack #Backtracking
// #2023_07_02_Time_156_ms_(66.67%)_Space_34_MB_(33.33%)

class Solution {
    fun smallestNumber(pattern: String): String {
        val ret = IntArray(pattern.length + 1)
        ret[0] = 1
        var max = 2
        var lastI = 0
        for (i in pattern.indices) {
            if (pattern[i] == 'I') {
                ret[i + 1] = max++
                lastI = i + 1
            } else {
                for (j in i downTo lastI) {
                    ret[j + 1] = ret[j]
                }
                ret[lastI] = max++
            }
        }
        val sb = StringBuilder()
        for (i in ret) {
            sb.append(i)
        }
        return sb.toString()
    }
}
