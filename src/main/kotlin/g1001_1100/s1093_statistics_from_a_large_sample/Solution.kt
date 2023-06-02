package g1001_1100.s1093_statistics_from_a_large_sample

// #Medium #Math #Two_Pointers #Probability_and_Statistics
// #2023_06_02_Time_191_ms_(100.00%)_Space_38_MB_(100.00%)

class Solution {
    fun sampleStats(count: IntArray): DoubleArray {
        var l = 0
        var r = 255
        var nl = 0
        var nr = 0
        var mn = 256
        var mx = -1
        var mid1 = 0
        var mid2 = 0
        var mode = 0
        var avg = 0.0
        while (l <= r) {
            while (count[l] == 0) {
                l++
            }
            while (count[r] == 0) {
                r--
            }
            if (nl < nr) {
                avg += count[l].toDouble() * l
                nl += count[l]
                if (count[l] > count[mode]) {
                    mode = l
                }
                mx = Math.max(mx, l)
                mn = Math.min(mn, l)
                mid1 = l
                l++
            } else {
                avg += count[r].toDouble() * r
                nr += count[r]
                if (count[r] > count[mode]) {
                    mode = r
                }
                mx = Math.max(mx, r)
                mn = Math.min(mn, r)
                mid2 = r
                r--
            }
        }
        avg /= (nl + nr).toDouble()
        // Find median
        val mid: Double = if (nl < nr) {
            mid2.toDouble()
        } else if (nl > nr) {
            mid1.toDouble()
        } else {
            (mid1 + mid2).toDouble() / 2
        }
        return doubleArrayOf(mn.toDouble(), mx.toDouble(), avg, mid, mode.toDouble())
    }
}
