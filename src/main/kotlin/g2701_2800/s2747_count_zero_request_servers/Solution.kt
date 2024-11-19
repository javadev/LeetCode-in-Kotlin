package g2701_2800.s2747_count_zero_request_servers

// #Medium #Array #Hash_Table #Sorting #Sliding_Window
// #2023_08_08_Time_991_ms_(100.00%)_Space_109.2_MB_(90.00%)

class Solution {
    fun countServers(n: Int, logs: Array<IntArray>, x: Int, qs: IntArray): IntArray {
        val m = qs.size
        val valIdx = Array(m) { IntArray(2) }
        for (i in 0 until m) valIdx[i] = intArrayOf(qs[i], i)
        valIdx.sortWith { a: IntArray, b: IntArray ->
            a[0] - b[0]
        }
        logs.sortWith { a: IntArray, b: IntArray ->
            a[1] - b[1]
        }
        var l = 0
        var r = 0
        val res = IntArray(m)
        val servCount: HashMap<Int, Int> = HashMap<Int, Int>()
        for (q in valIdx) {
            val rVal = q[0]
            val lVal = q[0] - x
            val i = q[1]
            while (r < logs.size && logs[r][1] <= rVal) servCount.merge(logs[r++][0], 1) { a: Int, b: Int ->
                Integer.sum(
                    a,
                    b,
                )
            }
            while (l < r && logs[l][1] < lVal) {
                servCount.compute(logs[l][0]) { _, v -> v!! - 1 }
                servCount.remove(logs[l][0], 0)
                l++
            }
            res[i] = n - servCount.size
        }
        return res
    }
}
