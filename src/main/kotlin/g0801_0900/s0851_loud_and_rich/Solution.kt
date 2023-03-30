package g0801_0900.s0851_loud_and_rich

// #Medium #Array #Depth_First_Search #Graph #Topological_Sort
// #2023_03_30_Time_347_ms_(100.00%)_Space_54.4_MB_(80.00%)

class Solution {
    fun loudAndRich(richer: Array<IntArray>, quiet: IntArray): IntArray {
        val result = IntArray(quiet.size)
        for (i in quiet.indices) {
            result[i] = i
        }
        for (k in quiet.indices) {
            var changed = false
            for (r in richer) {
                if (quiet[result[r[0]]] < quiet[result[r[1]]]) {
                    result[r[1]] = result[r[0]]
                    changed = true
                }
            }
            if (!changed) {
                break
            }
        }
        return result
    }
}
