package g0401_0500.s0455_assign_cookies

// #Easy #Array #Sorting #Greedy #2022_12_26_Time_260_ms_(96.67%)_Space_37.7_MB_(100.00%)

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sorr()
        var result = 0
        var i = 0
        var j = 0
        while (i < g.size && j < s.size) {
            if (s[j] >= g[i]) {
                result++
                i++
            }
            j++
        }
        return result
    }
}
