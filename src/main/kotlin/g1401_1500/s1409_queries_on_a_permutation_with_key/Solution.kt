package g1401_1500.s1409_queries_on_a_permutation_with_key

// #Medium #Array #Simulation #Binary_Indexed_Tree
// #2023_06_07_Time_209_ms_(100.00%)_Space_35.8_MB_(100.00%)

class Solution {
    fun processQueries(queries: IntArray, m: Int): IntArray {
        val ans = IntArray(queries.size)
        val list: MutableList<Int> = ArrayList()
        for (i in 0 until m) {
            list.add(i + 1)
        }
        for (i in queries.indices) {
            val index = list.indexOf(queries[i])
            ans[i] = index
            list.removeAt(index)
            list.add(0, queries[i])
        }
        return ans
    }
}
