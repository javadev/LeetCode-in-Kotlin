package g0701_0800.s0768_max_chunks_to_make_sorted_ii

// #Hard #Array #Sorting #Greedy #Stack #Monotonic_Stack
// #2023_03_09_Time_202_ms_(100.00%)_Space_37_MB_(100.00%)

class Solution {
    fun maxChunksToSorted(arr: IntArray): Int {
        val n = arr.size
        val lmax = IntArray(n)
        val rMin = IntArray(n + 1)
        lmax[0] = arr[0]
        for (i in 1 until n) {
            lmax[i] = lmax[i - 1].coerceAtLeast(arr[i])
        }
        rMin[n] = Int.MAX_VALUE
        for (i in n - 1 downTo 0) {
            rMin[i] = rMin[i + 1].coerceAtMost(arr[i])
        }
        var chunks = 0
        for (i in 0 until n) {
            if (lmax[i] <= rMin[i + 1]) {
                chunks++
            }
        }
        return chunks
    }
}
