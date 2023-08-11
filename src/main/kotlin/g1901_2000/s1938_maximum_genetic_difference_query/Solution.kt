package g1901_2000.s1938_maximum_genetic_difference_query

// #Hard #Array #Bit_Manipulation #Trie #2023_06_20_Time_855_ms_(100.00%)_Space_84.4_MB_(100.00%)

class Solution {
    fun maxGeneticDifference(parents: IntArray, queries: Array<IntArray>): IntArray {
        val n = parents.size
        val fd = arrayOfNulls<IntArray>(n)
        for (i in 0 until n) {
            fill(parents, n, fd, i)
        }
        val ret = IntArray(queries.size)
        for (q in queries.indices) {
            var cur = queries[q][0]
            val value = queries[q][1]
            for (p in 30 downTo 0) {
                val msk = 1 shl p
                if (value and msk != cur and msk) {
                    ret[q] = ret[q] or msk
                } else if (fd[cur]!![p] >= 0) {
                    ret[q] = ret[q] or msk
                    cur = fd[cur]!![p]
                }
            }
        }
        return ret
    }

    private fun fill(parents: IntArray, n: Int, fd: Array<IntArray?>, i: Int) {
        if (fd[i] == null) {
            fd[i] = IntArray(31)
            var a = parents[i]
            if (a >= 0) {
                fill(parents, n, fd, a)
            }
            for (p in 30 downTo 0) {
                if (a == -1) {
                    fd[i]!![p] = -1
                } else {
                    if (i and (1 shl p) == a and (1 shl p)) {
                        fd[i]!![p] = fd[a]!![p]
                    } else {
                        fd[i]!![p] = a
                        a = fd[a]!![p]
                    }
                }
            }
        }
    }
}
