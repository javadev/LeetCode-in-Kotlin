package g0201_0300.s0274_h_index

// #Medium #Array #Sorting #Counting_Sort #2022_11_04_Time_291_ms_(45.45%)_Space_34.7_MB_(100.00%)

class Solution {
    fun hIndex(citations: IntArray): Int {
        val counts = IntArray(citations.size + 1)
        for (citation in citations) {
            val idx = (citations.size).coerceAtMost(citation)
            counts[idx] += 1
        }
        var total = 0
        for (i in counts.indices) {
            val idx = citations.size - i
            total += counts[idx]
            if (total >= idx) {
                 return idx
            }
        }
        return 0
    }
}
