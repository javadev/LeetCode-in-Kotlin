package g3301_3400.s3327_check_if_dfs_strings_are_palindromes

// #Hard #Array #String #Hash_Table #Depth_First_Search #Tree #Hash_Function
// #2025_03_16_Time_86_ms_(100.00%)_Space_93.26_MB_(80.00%)

import kotlin.math.min

class Solution {
    private var time = 0
    private lateinit var cs: ByteArray
    private lateinit var graph: Array<IntArray?>

    fun findAnswer(parent: IntArray, s: String): BooleanArray {
        val n = s.length
        cs = s.toByteArray()
        graph = arrayOfNulls<IntArray>(n)
        val childCount = IntArray(n)
        for (i in 1..<n) {
            childCount[parent[i]]++
        }
        for (i in 0..<n) {
            graph[i] = IntArray(childCount[i])
            childCount[i] = 0
        }
        for (i in 1..<n) {
            graph[parent[i]]!![childCount[parent[i]]++] = i
        }
        val dfsStr = ByteArray(n)
        val start = IntArray(n)
        val end = IntArray(n)
        dfs(0, dfsStr, start, end)
        val lens = getRadius(dfsStr)
        val ans = BooleanArray(n)
        for (i in 0..<n) {
            val l = start[i]
            val r = end[i]
            val center = l + r + 2
            ans[i] = lens[center] >= r - l + 1
        }
        return ans
    }

    private fun dfs(u: Int, dfsStr: ByteArray, start: IntArray, end: IntArray) {
        start[u] = time
        for (v in graph[u]!!) {
            dfs(v, dfsStr, start, end)
        }
        dfsStr[time] = cs[u]
        end[u] = time++
    }

    private fun getRadius(cs: ByteArray): IntArray {
        val n = cs.size
        val t = ByteArray(2 * n + 3)
        var m = 0
        t[m++] = '@'.code.toByte()
        t[m++] = '#'.code.toByte()
        for (c in cs) {
            t[m++] = c
            t[m++] = '#'.code.toByte()
        }
        t[m++] = '$'.code.toByte()
        val lens = IntArray(m)
        var center = 0
        var right = 0
        for (i in 2..<m - 2) {
            var len = 0
            if (i < right) {
                len = min(lens[2 * center - i], right - i)
            }
            while (t[i + len + 1] == t[i - len - 1]) {
                len++
            }
            if (right < i + len) {
                right = i + len
                center = i
            }
            lens[i] = len
        }
        return lens
    }
}
