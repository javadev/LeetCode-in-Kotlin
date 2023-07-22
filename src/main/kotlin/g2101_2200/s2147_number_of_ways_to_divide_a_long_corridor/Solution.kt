package g2101_2200.s2147_number_of_ways_to_divide_a_long_corridor

// #Hard #String #Dynamic_Programming #Math
// #2023_06_25_Time_361_ms_(100.00%)_Space_40.5_MB_(100.00%)

class Solution {
    fun numberOfWays(corridor: String): Int {
        var seat = 0
        val mod = 1e9.toInt() + 7
        for (i in 0 until corridor.length) {
            if (corridor[i] == 'S') {
                seat++
            }
        }
        if (seat == 0 || seat % 2 != 0) {
            return 0
        }
        seat /= 2
        var curr: Long = 0
        var ans: Long = 1
        var i = 0
        while (corridor[i] != 'S') {
            i++
        }
        i++
        while (seat > 1) {
            while (corridor[i] != 'S') {
                i++
            }
            i++
            while (corridor[i] != 'S') {
                i++
                curr++
            }
            curr++
            ans = ans * curr % mod
            curr = 0
            seat--
            i++
        }
        return ans.toInt()
    }
}
