package g3901_4000.s3960_frequency_balance_subarray

// #Medium #Array #Hash_Table #Counting #Senior #Weekly_Contest_506
// #2026_10_20_Time_264_ms_(98.53%)_Space_46.59_MB_(97.06%)

import kotlin.math.max

class Solution {
    fun getLength(a: IntArray): Int {
        val n = a.size
        var ans = 1
        for (i in 0..<n) {
            val mp: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
            val fq = IntArray(n + 1)
            var mx = 0
            var s = 0
            for (j in i..<n) {
                val old: Int = mp.getOrDefault(a[j], 0)!!
                if (old > 0) {
                    fq[old]--
                }
                mp.put(a[j], old + 1)
                fq[old + 1]++
                if (old + 1 > mx) {
                    mx = old + 1
                    s = 1
                } else if (old + 1 == mx) {
                    s++
                }
                val distinct = mp.size
                if (distinct == 1 || (mx % 2 == 0 && s < distinct && fq[mx / 2] == distinct - s)) {
                    ans = max(ans, j - i + 1)
                }
            }
        }
        return ans
    }
}
