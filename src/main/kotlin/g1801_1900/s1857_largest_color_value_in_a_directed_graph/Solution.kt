package g1801_1900.s1857_largest_color_value_in_a_directed_graph

// #Hard #Hash_Table #Dynamic_Programming #Graph #Counting #Memoization #Topological_Sort
// #2023_10_02_Time_1005_ms_(60.00%)_Space_253.2_MB_(20.00%)

class Solution {
    fun largestPathValue(colors: String, edges: Array<IntArray>): Int {
        val len = colors.length
        val graph = buildGraph(len, edges)
        val frequencies = IntArray(26)
        val calculatedFrequencies = HashMap<Int, IntArray>()
        val status = IntArray(len)
        for (i in 0 until len) {
            if (status[i] != 0) {
                continue
            }
            val localMax = runDFS(graph, i, calculatedFrequencies, status, colors)
            if (localMax!![26] == -1) {
                frequencies.fill(-1)
                break
            } else {
                for (color in 0..25) {
                    frequencies[color] = Math.max(frequencies[color], localMax[color])
                }
            }
        }
        var max = Int.MIN_VALUE
        for (freq in frequencies) {
            max = Math.max(max, freq)
        }
        return max
    }

    private fun runDFS(
        graph: Array<MutableList<Int>?>,
        node: Int,
        calculatedFrequencies: HashMap<Int, IntArray>,
        status: IntArray,
        colors: String
    ): IntArray? {
        if (calculatedFrequencies.containsKey(node)) {
            return calculatedFrequencies[node]
        }
        val frequencies = IntArray(27)
        if (status[node] == 1) {
            frequencies[26] = -1
            return frequencies
        }
        status[node] = 1
        for (neighbour in graph[node]!!) {
            val localMax = runDFS(graph, neighbour, calculatedFrequencies, status, colors)
            if (localMax!![26] == -1) {
                return localMax
            }
            for (i in 0..25) {
                frequencies[i] = Math.max(frequencies[i], localMax[i])
            }
        }
        status[node] = 2
        val color = colors[node].code - 'a'.code
        frequencies[color]++
        calculatedFrequencies[node] = frequencies
        return frequencies
    }

    private fun buildGraph(n: Int, edges: Array<IntArray>): Array<MutableList<Int>?> {
        val graph: Array<MutableList<Int>?> = arrayOfNulls(n)
        for (i in 0 until n) {
            graph[i] = ArrayList()
        }
        for (edge in edges) {
            graph[edge[0]]?.add(edge[1])
        }
        return graph
    }
}
