package g1601_1700.s1697_checking_existence_of_edge_length_limited_paths

// #Hard #Array #Sorting #Graph #Union_Find
// #2023_06_15_Time_1411_ms_(72.90%)_Space_101.6_MB_(99.07%)

import java.util.Arrays

class Solution {
    private class Dsu(n: Int) {
        private val parent: IntArray

        init {
            parent = IntArray(n)
            parent.fill(-1)
        }

        fun find(num: Int): Int {
            if (parent[num] == -1) {
                return num
            }
            parent[num] = find(parent[num])
            return parent[num]
        }

        fun union(a: Int, b: Int) {
            val p1 = find(a)
            val p2 = find(b)
            if (p1 != p2) {
                parent[p2] = p1
            }
        }
    }

    fun distanceLimitedPathsExist(n: Int, edgeList: Array<IntArray>, queries: Array<IntArray>): BooleanArray {
        Arrays.sort(edgeList) { o1: IntArray, o2: IntArray -> Integer.compare(o1[2], o2[2]) }
        val data = Array(queries.size) { IntArray(4) }
        for (i in queries.indices) {
            data[i] = intArrayOf(queries[i][0], queries[i][1], queries[i][2], i)
        }
        Arrays.sort(data) { o1: IntArray, o2: IntArray -> Integer.compare(o1[2], o2[2]) }
        val d = Dsu(n)
        var j = 0
        val ans = BooleanArray(queries.size)
        for (datum in data) {
            while (j < edgeList.size && edgeList[j][2] < datum[2]) {
                d.union(edgeList[j][0], edgeList[j][1])
                j++
            }
            if (d.find(datum[0]) == d.find(datum[1])) {
                ans[datum[3]] = true
            }
        }
        return ans
    }
}
