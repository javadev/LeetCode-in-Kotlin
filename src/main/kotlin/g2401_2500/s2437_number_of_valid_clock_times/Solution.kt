package g2401_2500.s2437_number_of_valid_clock_times

// #Easy #String #Enumeration #2024_05_09_Time_133_ms_(64.29%)_Space_33.4_MB_(85.71%)

class Solution {
    fun countTime(time: String): Int {
        val counts = intArrayOf(3, 10, 0, 6, 10)
        val ch = time.toCharArray()
        var result = 1
        if (ch[0] == '2') {
            counts[1] = 4
        }
        if (ch[1].code - '0'.code > 3) {
            counts[0] = 2
        }
        if (ch[0] == '?' && ch[1] == '?') {
            counts[0] = 1
            counts[1] = 24
        }
        for (i in 0..4) {
            val ch1 = ch[i]
            if (ch1 == '?') {
                result *= counts[i]
            }
        }
        return result
    }
}
