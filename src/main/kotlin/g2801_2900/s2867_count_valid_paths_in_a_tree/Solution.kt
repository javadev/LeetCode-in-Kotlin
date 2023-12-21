package g2801_2900.s2867_count_valid_paths_in_a_tree

// #Hard #Dynamic_Programming #Math #Depth_First_Search #Tree #Number_Theory
// #2023_12_21_Time_793_ms_(100.00%)_Space_111.6_MB_(100.00%)

class Solution {
    private lateinit var isPrime: BooleanArray
    private lateinit var treeEdges: Array<MutableList<Int>?>
    private var r: Long = 0

    private fun preparePrime(n: Int): BooleanArray {
        // Sieve of Eratosthenes < 3
        val isPrimeLocal = BooleanArray(n + 1)
        for (i in 2 until n + 1) {
            isPrimeLocal[i] = true
        }
        for (i in 2..n / 2) {
            var j = 2 * i
            while (j < n + 1) {
                isPrimeLocal[j] = false
                j += i
            }
        }
        return isPrimeLocal
    }

    private fun prepareTree(n: Int, edges: Array<IntArray>): Array<MutableList<Int>?> {
        val treeEdgesLocal: Array<MutableList<Int>?> = arrayOfNulls(n + 1)
        for (edge in edges) {
            if (treeEdgesLocal[edge[0]] == null) {
                treeEdgesLocal[edge[0]] = ArrayList()
            }
            treeEdgesLocal[edge[0]]!!.add(edge[1])
            if (treeEdgesLocal[edge[1]] == null) {
                treeEdgesLocal[edge[1]] = ArrayList()
            }
            treeEdgesLocal[edge[1]]!!.add(edge[0])
        }
        return treeEdgesLocal
    }

    private fun countPathDfs(node: Int, parent: Int): LongArray {
        val v = longArrayOf((if (isPrime[node]) 0 else 1).toLong(), (if (isPrime[node]) 1 else 0).toLong())
        val edges = treeEdges[node] ?: return v
        for (neigh in edges) {
            if (neigh == parent) {
                continue
            }
            val ce = countPathDfs(neigh, node)
            r += v[0] * ce[1] + v[1] * ce[0]
            if (isPrime[node]) {
                v[1] += ce[0]
            } else {
                v[0] += ce[0]
                v[1] += ce[1]
            }
        }
        return v
    }

    fun countPaths(n: Int, edges: Array<IntArray>): Long {
        isPrime = preparePrime(n)
        treeEdges = prepareTree(n, edges)
        r = 0
        countPathDfs(1, 0)
        return r
    }
}
