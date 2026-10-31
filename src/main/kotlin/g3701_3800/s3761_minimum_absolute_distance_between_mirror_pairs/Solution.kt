package g3701_3800.s3761_minimum_absolute_distance_between_mirror_pairs

// #Medium #Array #Hash_Table #Math #Staff #Weekly_Contest_478
// #2026_05_08_Time_49_ms_(84.83%)_Space_95.13_MB_(49.31%)

import kotlin.math.min

class Solution {
    fun minMirrorPairDistance(nums: IntArray): Int {
        var res = 100000
        var i = 0
        val seen = HashMap<Int?, Int?>()
        for (n in nums) {
            var n = n
            var r: Int
            if (seen.containsKey(n)) {
                res = min(res, i - seen[n]!!)
            }
            r = 0
            while (n > 0) {
                r = r * 10 + (n % 10)
                n /= 10
            }
            seen[r] = i++
        }

        return if (res == 100000) -1 else res
    }
}
