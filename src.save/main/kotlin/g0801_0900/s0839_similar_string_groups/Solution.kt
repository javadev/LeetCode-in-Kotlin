package g0801_0900.s0839_similar_string_groups

// #Hard #Array #String #Depth_First_Search #Breadth_First_Search #Union_Find
// #2023_03_28_Time_205_ms_(100.00%)_Space_35.9_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun numSimilarGroups(strs: Array<String>): Int {
        val visited = BooleanArray(strs.size)
        var res = 0
        for (i in strs.indices) {
            if (!visited[i]) {
                res++
                bfs(i, visited, strs)
            }
        }
        return res
    }

    private fun bfs(i: Int, visited: BooleanArray, strs: Array<String>) {
        val qu: Queue<String> = LinkedList()
        qu.add(strs[i])
        visited[i] = true
        while (!qu.isEmpty()) {
            val s = qu.poll()
            for (j in strs.indices) {
                if (visited[j]) {
                    continue
                }
                if (isSimilar(s, strs[j])) {
                    visited[j] = true
                    qu.add(strs[j])
                }
            }
        }
    }

    private fun isSimilar(s1: String, s2: String): Boolean {
        var c1: Char? = null
        var c2: Char? = null
        var mismatchCount = 0
        for (i in s1.indices) {
            if (s1[i] == s2[i]) {
                continue
            }
            mismatchCount++
            if (c1 == null) {
                c1 = s1[i]
                c2 = s2[i]
            } else if (s2[i] != c1 || s1[i] != c2) {
                return false
            } else if (mismatchCount > 2) {
                return false
            }
        }
        return true
    }
}
