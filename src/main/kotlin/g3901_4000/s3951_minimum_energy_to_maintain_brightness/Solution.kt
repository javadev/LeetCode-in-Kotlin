package g3901_4000.s3951_minimum_energy_to_maintain_brightness

// #Medium #Array #Sorting #Senior #Biweekly_Contest_184
// #2026_10_20_Time_10_ms_(100.00%)_Space_189.60_MB_(91.67%)

class Solution {
    fun minEnergy(n: Int, brightness: Int, intervals: Array<IntArray>): Long {
        intervals.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
        var st = 0
        var ed = -1
        var tot = 0
        for (a in intervals) {
            if (a[0] <= ed) {
                if (a[1] > ed) {
                    ed = a[1]
                }
            } else {
                tot += ed - st + 1
                st = a[0]
                ed = a[1]
            }
        }
        tot += ed - st + 1
        return tot.toLong() * ((brightness + 2) / 3)
    }
}
