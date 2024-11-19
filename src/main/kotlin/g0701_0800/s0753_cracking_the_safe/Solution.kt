package g0701_0800.s0753_cracking_the_safe

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2023_03_07_Time_147_ms_(100.00%)_Space_34.5_MB_(100.00%)

import kotlin.math.pow

class Solution {
    private var foundStr: String? = null
    fun crackSafe(n: Int, k: Int): String? {
        val targetCnt = k.toDouble().pow(n.toDouble()).toInt()
        val visited = BooleanArray(10.0.pow(n.toDouble()).toInt())
        visited[0] = true
        val visitedCnt = 1
        val crackStr = StringBuilder()
        for (i in 0 until n) {
            crackStr.append('0')
        }
        dfsAddPwd(n, k, crackStr, 0, visited, visitedCnt, targetCnt)
        return foundStr
    }

    private fun dfsAddPwd(
        n: Int,
        k: Int,
        crackStr: StringBuilder,
        prev: Int,
        visited: BooleanArray,
        visitedCnt: Int,
        targetCnt: Int,
    ) {
        if (foundStr != null) {
            return
        }
        if (visitedCnt == targetCnt) {
            foundStr = crackStr.toString()
            return
        }
        val root = 10 * prev % 10.0.pow(n.toDouble()).toInt()
        for (i in 0 until k) {
            val current = root + i
            if (!visited[current]) {
                crackStr.append(i)
                visited[current] = true
                dfsAddPwd(n, k, crackStr, current, visited, visitedCnt + 1, targetCnt)
                crackStr.setLength(crackStr.length - 1)
                visited[current] = false
            }
        }
    }
}
