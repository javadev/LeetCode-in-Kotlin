package g0301_0400.s0399_evaluate_division

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Graph #Union_Find #Shortest_Path
// #2022_11_29_Time_183_ms_(91.49%)_Space_34.6_MB_(95.74%)

class Solution {
    private var root: MutableMap<String?, String?>? = null
    private var rate: MutableMap<String?, Double>? = null
    fun calcEquation(
        equations: List<List<String?>>,
        values: DoubleArray,
        queries: List<List<String?>>
    ): DoubleArray {
        root = HashMap()
        rate = HashMap()
        val n = equations.size
        for (equation in equations) {
            val x = equation[0]
            val y = equation[1]
            (root as HashMap<String?, String?>)[x] = x
            (root as HashMap<String?, String?>)[y] = y
            (rate as HashMap<String?, Double>)[x] = 1.0
            (rate as HashMap<String?, Double>)[y] = 1.0
        }
        for (i in 0 until n) {
            val x = equations[i][0]
            val y = equations[i][1]
            union(x, y, values[i])
        }
        val result = DoubleArray(queries.size)
        for (i in queries.indices) {
            val x = queries[i][0]
            val y = queries[i][1]
            if (!(root as HashMap<String?, String?>).containsKey(x) ||
                !(root as HashMap<String?, String?>).containsKey(y)
            ) {
                result[i] = -1.0
                continue
            }
            val rootX = findRoot(x, x, 1.0)
            val rootY = findRoot(y, y, 1.0)
            result[i] = if (rootX == rootY) (rate as HashMap<String?, Double>).get(x)!! /
                (rate as HashMap<String?, Double>).get(y)!! else -1.0
        }
        return result
    }

    private fun union(x: String?, y: String?, v: Double) {
        val rootX = findRoot(x, x, 1.0)
        val rootY = findRoot(y, y, 1.0)
        root!![rootX] = rootY
        val r1 = rate!![x]!!
        val r2 = rate!![y]!!
        rate!![rootX] = v * r2 / r1
    }

    private fun findRoot(originalX: String?, x: String?, r: Double): String? {
        if (root!![x] == x) {
            root!![originalX] = x
            rate!![originalX] = r * rate!![x]!!
            return x
        }
        return findRoot(originalX, root!![x], r * rate!![x]!!)
    }
}
