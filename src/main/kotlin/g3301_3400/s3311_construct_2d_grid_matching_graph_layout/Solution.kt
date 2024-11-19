package g3301_3400.s3311_construct_2d_grid_matching_graph_layout

// #Hard #Array #Hash_Table #Matrix #Graph
// #2024_10_12_Time_1423_ms_(100.00%)_Space_113.1_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun constructGridLayout(n: Int, edges: Array<IntArray>): Array<IntArray> {
        val cs = IntArray(n)
        val als: Array<ArrayList<Int>> = Array<ArrayList<Int>>(n) { ArrayList<Int>() }
        for (e in edges) {
            cs[e[0]]++
            cs[e[1]]++
            als[e[0]].add(e[1])
            als[e[1]].add(e[0])
        }
        var min = 4
        for (a in cs) {
            min = min(min, a)
        }
        val seen = BooleanArray(n)
        var res: Array<IntArray>
        var st = 0
        for (i in 0 until n) {
            if (cs[i] == min) {
                st = i
                break
            }
        }
        if (min == 1) {
            res = Array<IntArray>(1) { IntArray(n) }
            for (i in 0 until n) {
                res[0][i] = st
                seen[st] = true
                if (i + 1 < n) {
                    for (a in als[st]) {
                        if (!seen[a]) {
                            st = a
                            break
                        }
                    }
                }
            }
            return res
        }
        var row2 = -1
        for (a in als[st]) {
            if (cs[a] == min) {
                row2 = a
                break
            }
        }
        if (row2 >= 0) {
            return getInts2(n, st, row2, seen, als)
        }
        return getInts1(n, seen, st, als, cs)
    }

    private fun getInts1(
        n: Int,
        seen: BooleanArray,
        st: Int,
        als: Array<ArrayList<Int>>,
        cs: IntArray,
    ): Array<IntArray> {
        var st = st
        var res: Array<IntArray>
        val al = ArrayList<Int?>()
        var f = true
        seen[st] = true
        al.add(st)
        while (f) {
            f = false
            for (a in als[st]) {
                if (!seen[a] && cs[a] <= 3) {
                    seen[a] = true
                    al.add(a)
                    if (cs[a] == 3) {
                        f = true
                        st = a
                    }
                    break
                }
            }
        }
        res = Array<IntArray>(n / al.size) { IntArray(al.size) }
        for (i in res[0].indices) {
            res[0][i] = al[i]!!
        }
        for (i in 1 until res.size) {
            for (j in res[0].indices) {
                for (a in als[res[i - 1][j]]) {
                    if (!seen[a]) {
                        res[i][j] = a
                        seen[a] = true
                        break
                    }
                }
            }
        }
        return res
    }

    private fun getInts2(
        n: Int,
        st: Int,
        row2: Int,
        seen: BooleanArray,
        als: Array<ArrayList<Int>>,
    ): Array<IntArray> {
        var res: Array<IntArray> = Array<IntArray>(2) { IntArray(n / 2) }
        res[0][0] = st
        res[1][0] = row2
        seen[row2] = true
        seen[st] = seen[row2]
        for (i in 1 until res[0].size) {
            for (a in als[res[0][i - 1]]) {
                if (!seen[a]) {
                    res[0][i] = a
                    seen[a] = true
                    break
                }
            }
            for (a in als[res[1][i - 1]]) {
                if (!seen[a]) {
                    res[1][i] = a
                    seen[a] = true
                    break
                }
            }
        }
        return res
    }
}
