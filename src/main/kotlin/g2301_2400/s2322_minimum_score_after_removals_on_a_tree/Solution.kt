package g2301_2400.s2322_minimum_score_after_removals_on_a_tree

// #Hard #Array #Depth_First_Search #Tree #Bit_Manipulation
// #2023_06_30_Time_412_ms_(100.00%)_Space_49.1_MB_(100.00%)

class Solution {
    private var ans = Int.MAX_VALUE

    // function to travel 2nd time on the tree and find the second edge to be removed
    private fun helper(
        src: Int,
        graph: Array<ArrayList<Int>?>,
        arr: IntArray,
        par: Int,
        block: Int,
        xor1: Int,
        tot: Int
    ): Int {
        // Setting the value for the current subtree's XOR value
        var myXOR = arr[src]
        for (nbr in graph[src]!!) {
            // If the current nbr is niether the parent of this node nor the blocked node  , then
            // only we'll proceed
            if (nbr != par && nbr != block) {
                val nbrXOR = helper(nbr, graph, arr, src, block, xor1, tot)
                // 'src <----> nbr' is the second edge to be removed
                // Getting the XOR value of the current neighbor
                // The XOR of the remaining component
                val xor3 = tot xor xor1 xor nbrXOR
                // Getting the minimum of the three values
                val max = xor1.coerceAtLeast(nbrXOR.coerceAtLeast(xor3))
                // Getting the maximum of the three value
                val min = xor1.coerceAtMost(nbrXOR.coerceAtMost(xor3))
                ans = ans.coerceAtMost(max - min)
                // Including the neighbour subtree's XOR value in the XOR value of the subtree
                // rooted at src node
                myXOR = myXOR xor nbrXOR
            }
        }
        // Returing the XOR value of the current subtree rooted at the src node
        return myXOR
    }

    // function to travel 1st time on the tree and find the first edge to be removed and
    // then block the node at which the edge ends to avoid selecting the same node again
    private fun dfs(src: Int, graph: Array<ArrayList<Int>?>, arr: IntArray, par: Int, tot: Int): Int {
        // Setting the value for the current subtree's XOR value
        var myXOR = arr[src]
        for (nbr in graph[src]!!) {
            // If the current nbr is not the parent of this node, then only we'll proceed
            if (nbr != par) {
                // After selecting 'src <----> nbr' as the first edge, we block 'nbr' node and then
                // make a call to try all the second edges
                val nbrXOR = dfs(nbr, graph, arr, src, tot)
                // Calling the helper to find the try all the second edges after blocking the
                // current node
                helper(0, graph, arr, -1, nbr, nbrXOR, tot)
                // Including the neighbour subtree's XOR value in the XOR value of the subtree
                // rooted at src node
                myXOR = myXOR xor nbrXOR
            }
        }
        // Returing the XOR value of the current subtree rooted at the src node
        return myXOR
    }

    fun minimumScore(arr: IntArray, edges: Array<IntArray>): Int {
        val n = arr.size
        val graph: Array<ArrayList<Int>?> = arrayOfNulls(n)
        var tot = 0
        for (i in 0 until n) {
            // Initializing the graph and finding the total XOR
            graph[i] = ArrayList()
            tot = tot xor arr[i]
        }
        for (edge in edges) {
            // adding the edges
            val u = edge[0]
            val v = edge[1]
            graph[u]!!.add(v)
            graph[v]!!.add(u)
        }
        ans = Int.MAX_VALUE
        dfs(0, graph, arr, -1, tot)
        return ans
    }
}
