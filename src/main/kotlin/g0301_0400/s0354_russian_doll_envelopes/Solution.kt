package g0301_0400.s0354_russian_doll_envelopes

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
// #2022_11_19_Time_788_ms_(100.00%)_Space_113.2_MB_(50.00%)

class Solution {
    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        envelopes.sortWith { a: IntArray, b: IntArray ->
            if (a[0] != b[0]
            ) a[0] - b[0] else b[1] - a[1]
        }
        val tails = IntArray(envelopes.size)
        var size = 0
        for (enve in envelopes) {
            var i = 0
            var j = size
            while (i != j) {
                val mid = i + (j - i shr 1)
                if (tails[mid] < enve[1]) {
                    i = mid + 1
                } else {
                    j = mid
                }
            }
            tails[i] = enve[1]
            if (i == size) {
                size++
            }
        }
        return size
    }
}
