package g3501_3600.s3547_maximum_sum_of_edge_values_in_a_graph

// #Hard #2025_05_11_Time_61_ms_(100.00%)_Space_86.35_MB_(100.00%)

class Solution {
    private lateinit var p: IntArray
    private lateinit var c: BooleanArray
    private lateinit var s: IntArray

    fun maxScore(n: Int, edges: Array<IntArray>): Long {
        initializeArrays(n)
        processEdges(edges)
        val circles: MutableList<Int> = ArrayList<Int>()
        val chains: MutableList<Int> = ArrayList<Int>()
        findParentsAndUpdateCircles()
        collectCirclesAndChains(circles, chains)
        circles.sort()
        chains.sortWith { a: Int, b: Int -> Integer.compare(b, a) }
        return calculateScore(n, circles, chains)
    }

    private fun initializeArrays(n: Int) {
        p = IntArray(n)
        c = BooleanArray(n)
        s = IntArray(n)
        for (i in 0..<n) {
            p[i] = i
            s[i] = 1
        }
    }

    private fun processEdges(edges: Array<IntArray>) {
        for (ele in edges) {
            join(ele[0], ele[1])
        }
    }

    private fun findParentsAndUpdateCircles() {
        for (i in p.indices) {
            p[i] = findParent(i)
            if (c[i]) {
                c[p[i]] = true
            }
        }
    }

    private fun collectCirclesAndChains(circles: MutableList<Int>, chains: MutableList<Int>) {
        for (i in p.indices) {
            if (p[i] == i) {
                val size = s[i]
                if (c[i]) {
                    circles.add(size)
                } else {
                    chains.add(size)
                }
            }
        }
    }

    private fun calculateScore(n: Int, circles: MutableList<Int>, chains: MutableList<Int>): Long {
        var ret: Long = 0
        var start = n
        ret += processCircles(circles, start)
        start = n - getTotalCircleSize(circles)
        ret += processChains(chains, start)
        return ret
    }

    private fun getTotalCircleSize(circles: MutableList<Int>): Int {
        return circles.stream().mapToInt { obj: Int -> obj }.sum()
    }

    private fun processCircles(circles: MutableList<Int>, start: Int): Long {
        var start = start
        var ret: Long = 0
        for (size in circles) {
            if (size == 1) {
                continue
            }
            val temp = createTempArray(size, start)
            val pro = calculateProduct(temp, true)
            ret += pro
            start = start - size
        }
        return ret
    }

    private fun processChains(chains: MutableList<Int>, start: Int): Long {
        var start = start
        var ret: Long = 0
        for (size in chains) {
            if (size == 1) {
                continue
            }
            val temp = createTempArray(size, start)
            val pro = calculateProduct(temp, false)
            ret += pro
            start = start - size
        }
        return ret
    }

    private fun createTempArray(size: Int, start: Int): IntArray {
        val temp = IntArray(size)
        var ptr1 = 0
        var ptr2 = size - 1
        val curStart = start - size + 1
        for (i in 0..<size) {
            if (i % 2 == 0) {
                temp[ptr1++] = curStart + i
            } else {
                temp[ptr2--] = curStart + i
            }
        }
        return temp
    }

    private fun calculateProduct(temp: IntArray, isCircle: Boolean): Long {
        var pro: Long = 0
        for (i in 1..<temp.size) {
            pro += temp[i].toLong() * temp[i - 1]
        }
        if (isCircle) {
            pro += temp[0].toLong() * temp[temp.size - 1]
        }
        return pro
    }

    private fun findParent(x: Int): Int {
        if (p[x] != x) {
            p[x] = findParent(p[x])
        }
        return p[x]
    }

    private fun join(a: Int, b: Int) {
        val bp = findParent(a)
        val ap = findParent(b)
        if (bp == ap) {
            c[bp] = true
            return
        }
        val s1 = s[ap]
        val s2 = s[bp]
        if (s1 > s2) {
            p[bp] = ap
            s[ap] += s[bp]
        } else {
            p[ap] = bp
            s[bp] += s[ap]
        }
    }
}
