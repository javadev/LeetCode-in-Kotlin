package g2301_2400.s2375_construct_smallest_number_from_di_string

// #Medium #String #Greedy #Stack #Backtracking
class Solution {
    fun smallestNumber(pattern: String): String {
        val ret = IntArray(pattern.length + 1)
        ret[0] = 1
        var max = 2
        var lastI = 0
        for (i in 0 until pattern.length) {
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
