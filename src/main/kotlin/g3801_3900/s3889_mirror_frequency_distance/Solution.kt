package g3801_3900.s3889_mirror_frequency_distance

// #Medium #String #Hash_Table #Counting #Senior #Weekly_Contest_496
// #2026_08_13_Time_18_ms_(99.69%)_Space_56.73_MB_(92.00%)

import kotlin.math.abs

class Solution {
    fun mirrorFrequency(s: String): Int {
        val freq = IntArray(257)
        val n = s.length
        for (i in 0..<n) {
            val curr = s.get(i)
            freq[curr.code]++
        }
        var ans = 0
        run {
            var i = 'a'.code
            while (i <= 'z'.code) {
                if (freq[i] > 0) {
                    ans = ans + abs(freq[i] - freq['z'.code - (i - 'a'.code)])
                    freq[i] = 0
                    freq['z'.code - (i - 'a'.code)] = 0
                }
                i++
            }
        }
        var i = '0'.code
        while (i <= '9'.code) {
            if (freq[i] > 0) {
                ans = ans + abs(freq[i] - freq['9'.code - (i - '0'.code)])
                freq[i] = 0
                freq['9'.code - (i - '0'.code)] = 0
            }
            i++
        }
        return ans
    }
}
