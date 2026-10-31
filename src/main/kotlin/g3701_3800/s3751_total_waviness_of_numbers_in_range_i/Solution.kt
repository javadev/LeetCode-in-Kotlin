package g3701_3800.s3751_total_waviness_of_numbers_in_range_i

// #Medium #Dynamic_Programming #Math #Enumeration #Senior #Biweekly_Contest_170
// #2026_04_26_Time_11_ms_(98.18%)_Space_42.55_MB_(97.88%)

class Solution {
    private fun countpeakValley(num: Int): Int {
        var num = num
        var lastdigit = num % 10
        var waiviness = 0
        var prevcurrent = -1
        num = num / 10
        while (num > 0) {
            if (prevcurrent == -1) {
                prevcurrent = num % 10
                num = num / 10
                continue
            }
            val currvalue = num % 10
            if ((prevcurrent > currvalue && prevcurrent > lastdigit) ||
                (prevcurrent < currvalue && prevcurrent < lastdigit)
            ) {
                waiviness++
            }
            lastdigit = prevcurrent
            prevcurrent = num % 10
            num = num / 10
        }
        return waiviness
    }

    fun totalWaviness(num1: Int, num2: Int): Int {
        var ans = 0
        for (i in num1..num2) {
            val l = countpeakValley(i)
            ans = ans + l
        }
        return ans
    }
}
