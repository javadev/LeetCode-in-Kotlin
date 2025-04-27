package g3501_3600.s3534_path_existence_queries_in_a_graph_ii

// #Hard #2025_04_27_Time_152_ms_(100.00%)_Space_132.11_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun pathExistenceQueries(n: Int, nums: IntArray, maxDiff: Int, queries: Array<IntArray>): IntArray {
        val position = IntArray(n)
        val values = IntArray(n)
        val sortedIndices = Array(n) { i -> i }
        sortedIndices.sortWith { a: Int, b: Int -> nums[a].compareTo(nums[b]) }
        for (i in 0..<n) {
            position[sortedIndices[i]] = i
            values[i] = nums[sortedIndices[i]]
        }
        val reachableIndex = IntArray(n)
        var j = 0
        for (i in 0..<n) {
            if (j < i) {
                j = i
            }
            while (j + 1 < n && values[j + 1] - values[i] <= maxDiff) {
                j++
            }
            reachableIndex[i] = j
        }
        var maxLog = 1
        while ((1 shl maxLog) < n) {
            maxLog++
        }
        val upTable = Array(maxLog) { IntArray(n) }
        upTable[0] = reachableIndex.clone()
        for (k in 1..<maxLog) {
            for (i in 0..<n) {
                upTable[k][i] = upTable[k - 1][upTable[k - 1][i]]
            }
        }
        val results = IntArray(queries.size)
        for (idx in queries.indices) {
            val start = queries[idx][0]
            val end = queries[idx][1]
            if (start == end) {
                results[idx] = 0
                continue
            }
            var startPos = position[start]
            var endPos = position[end]
            if (startPos > endPos) {
                val temp = startPos
                startPos = endPos
                endPos = temp
            }
            if (abs(nums[start] - nums[end]) <= maxDiff) {
                results[idx] = 1
                continue
            }
            if (reachableIndex[startPos] < endPos) {
                var current = startPos
                var jumpCount = 0
                for (k in maxLog - 1 downTo 0) {
                    if (upTable[k][current] < endPos) {
                        if (upTable[k][current] == current) {
                            break
                        }
                        current = upTable[k][current]
                        jumpCount += 1 shl k
                    }
                }
                if (reachableIndex[current] >= endPos) {
                    results[idx] = jumpCount + 1
                } else {
                    results[idx] = -1
                }
            } else {
                results[idx] = 1
            }
        }
        return results
    }
}
