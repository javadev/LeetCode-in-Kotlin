package g2201_2300.s2272_substring_with_largest_variance

// #Hard #Array #Dynamic_Programming #2023_06_28_Time_338_ms_(100.00%)_Space_36.8_MB_(100.00%)

class Solution {
    fun largestVariance(s: String): Int {
        val freq = IntArray(26)
        for (i in 0 until s.length) {
            freq[s[i].code - 'a'.code]++
        }
        var maxVariance = 0
        for (a in 0..25) {
            for (b in 0..25) {
                var remainingA = freq[a]
                val remainingB = freq[b]
                if (a == b || remainingA == 0 || remainingB == 0) {
                    continue
                }
                var currBFreq = 0
                var currAFreq = 0
                for (i in 0 until s.length) {
                    val c = s[i].code - 'a'.code
                    if (c == b) {
                        currBFreq++
                    }
                    if (c == a) {
                        currAFreq++
                        remainingA--
                    }
                    if (currAFreq > 0) {
                        maxVariance = Math.max(maxVariance, currBFreq - currAFreq)
                    }
                    if (currBFreq < currAFreq && remainingA >= 1) {
                        currBFreq = 0
                        currAFreq = 0
                    }
                }
            }
        }
        return maxVariance
    }
}
