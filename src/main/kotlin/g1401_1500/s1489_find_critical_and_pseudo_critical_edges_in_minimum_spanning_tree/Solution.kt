package g1401_1500.s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree

// #Hard #Sorting #Graph #Union_Find #Minimum_Spanning_Tree #Strongly_Connected_Component
// #2023_06_13_Time_342_ms_(100.00%)_Space_39.1_MB_(100.00%)

import java.util.Arrays
import java.util.LinkedList

class Solution {
    fun findCriticalAndPseudoCriticalEdges(n: Int, edges: Array<IntArray>): List<List<Int>> {
        // {w, ind}
        val g = Array(n) { Array(n) { IntArray(2) } }
        for (i in edges.indices) {
            val e = edges[i]
            val f = e[0]
            val t = e[1]
            val w = e[2]
            g[f][t][0] = w
            g[t][f][0] = w
            g[f][t][1] = i
            g[t][f][1] = i
        }
        val mst: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            mst[i] = LinkedList()
        }
        val mstSet = BooleanArray(edges.size)
        Arrays.sort(edges) { a: IntArray, b: IntArray ->
            Integer.compare(
                a[2], b[2]
            )
        }
        buildMST(n, edges, mstSet, mst, g)
        val ans: MutableList<List<Int>> = ArrayList(2)
        val pce: MutableSet<Int> = HashSet()
        val ce: MutableList<Int> = LinkedList()
        // pseudo critical edges
        for (edge in edges) {
            val f = edge[0]
            val t = edge[1]
            val w = edge[2]
            val ind = g[f][t][1]
            if (!mstSet[ind]) {
                val cur: MutableSet<Int> = HashSet()
                val p = path(f, t, w, -1, mst, g, cur)
                if (p && !cur.isEmpty()) {
                    pce.addAll(cur)
                    pce.add(ind)
                }
                if (!p) {
                    println("Should not reach here")
                }
            }
        }
        // critical edges
        for (edge in edges) {
            val f = edge[0]
            val t = edge[1]
            val ind = g[f][t][1]
            if (mstSet[ind] && !pce.contains(ind)) {
                ce.add(ind)
            }
        }
        ans.add(ce)
        ans.add(LinkedList(pce))
        return ans
    }

    private fun path(
        f: Int,
        t: Int,
        w: Int,
        p: Int,
        mst: Array<MutableList<Int>?>,
        g: Array<Array<IntArray>>,
        ind: MutableSet<Int>
    ): Boolean {
        if (f == t) {
            return true
        }
        for (nbr in mst[f]!!) {
            if (p != nbr && path(nbr, t, w, f, mst, g, ind)) {
                if (g[f][nbr][0] == w) {
                    ind.add(g[f][nbr][1])
                }
                return true
            }
        }
        return false
    }

    private fun buildMST(
        n: Int,
        edges: Array<IntArray>,
        mste: BooleanArray,
        mstg: Array<MutableList<Int>?>,
        g: Array<Array<IntArray>>
    ) {
        val ds = DisjointSet(n)
        for (ints in edges) {
            if (ds.union(ints[0], ints[1])) {
                mstg[ints[0]]?.add(ints[1])
                mstg[ints[1]]?.add(ints[0])
                mste[g[ints[0]][ints[1]][1]] = true
            }
        }
    }

    private class DisjointSet(n: Int) {
        var parent: IntArray

        init {
            parent = IntArray(n)
            for (i in 0 until n) {
                parent[i] = i
            }
        }

        fun find(i: Int): Int {
            if (i == parent[i]) {
                return i
            }
            parent[i] = find(parent[i])
            return parent[i]
        }

        fun union(u: Int, v: Int): Boolean {
            val pu = find(u)
            val pv = find(v)
            if (pu == pv) {
                return false
            }
            parent[pu] = pv
            return true
        }
    }
}
