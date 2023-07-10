package g0001_0100.s0093_restore_ip_addresses

// #Medium #String #Backtracking #2023_07_10_Time_152_ms_(100.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        val results: MutableList<String> = ArrayList()
        step(s, 0, IntArray(4), 0, results)
        return results
    }

    fun step(s: String, pos: Int, octets: IntArray, count: Int, results: MutableList<String>) {
        if (count == 4 && pos == s.length) {
            results.add(
                octets[0].toString() + '.' +
                    octets[1] +
                    '.' +
                    octets[2] +
                    '.' +
                    octets[3]
            )
        } else if (count < 4 && pos < 12) {
            var octet = 0
            for (i in 0..2) {
                if (pos + i < s.length) {
                    val digit = s[pos + i] - '0'
                    octet = octet * 10 + digit
                    if (octet < 256) {
                        octets[count] = octet
                        step(s, pos + i + 1, octets, count + 1, results)
                    }
                    if (i == 0 && digit == 0) {
                        break
                    }
                }
            }
        }
    }
}
