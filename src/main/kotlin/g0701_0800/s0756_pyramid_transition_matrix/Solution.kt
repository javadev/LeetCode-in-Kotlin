package g0701_0800.s0756_pyramid_transition_matrix

// #Medium #Depth_First_Search #Breadth_First_Search #Bit_Manipulation
// #2023_03_07_Time_268_ms_(100.00%)_Space_34.2_MB_(100.00%)

class Solution {
    private fun dfs(c: CharArray, i: Int, l: Int, map: Array<IntArray>): Boolean {
        if (l == 1) {
            return true
        }
        if (i == l - 1) {
            return dfs(c, 0, l - 1, map)
        }
        val save = c[i]
        var p = 'A'
        var v = map[c[i].code - 'A'.code][c[i + 1].code - 'A'.code]
        while (v != 0) {
            if (v and 1 != 0) {
                c[i] = p
                if (dfs(c, i + 1, l, map)) {
                    return true
                }
            }
            v = v shr 1
            p++
        }
        c[i] = save
        return false
    }

    fun pyramidTransition(bottom: String, allowed: List<String>): Boolean {
        val map = Array(7) { IntArray(7) }
        for (s in allowed) {
            map[s[0].code - 'A'.code][s[1].code - 'A'.code] =
                map[s[0].code - 'A'.code][s[1].code - 'A'.code] or (1 shl s[2].code - 'A'.code)
        }
        return dfs(bottom.toCharArray(), 0, bottom.length, map)
    }
}
