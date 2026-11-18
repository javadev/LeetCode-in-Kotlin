package g4001_4100.s4010_maximize_pair_strength_using_gcd

// #Easy #Array #Math #Enumeration #Number_Theory #Mid_Level #Weekly_Contest_513
// #2026_11_17_Time_165_ms_(98.84%)_Space_47.01_MB_(19.42%)

class Solution {
    private fun gcd(n: Int, m: Int): Int {
        var n = n
        var m = m
        while (m != 0) {
            val remainder = n % m
            n = m
            m = remainder
        }
        return n
    }

    fun maxPairStrength(nums: IntArray): Long {
        var maxStrength: Long = 0
        val end = nums.size - 1
        nums.sort()
        for (i in end downTo 1) {
            for (j in i - 1 downTo 0) {
                val product = nums[i].toLong() * nums[j]
                if (product <= maxStrength) {
                    break
                }
                val hcf = gcd(nums[i], nums[j])
                if (hcf == 0) {
                    continue
                }
                val currentStrength = (nums[i] / hcf).toLong() * (nums[j] / hcf)
                if (currentStrength > maxStrength) {
                    maxStrength = currentStrength
                }
            }
        }
        return maxStrength
    }
}
