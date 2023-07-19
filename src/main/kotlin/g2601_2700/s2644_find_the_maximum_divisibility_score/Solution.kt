package g2601_2700.s2644_find_the_maximum_divisibility_score

// #Easy #Array #2023_07_19_Time_585_ms_(100.00%)_Space_40.2_MB_(83.33%)

class Solution {
    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        var maxDivisor = divisors.first()
        var maxDividedNums = 0
        for (divisor in divisors) {
            var dividedNums = 0
            for (num in nums) {
                if (num % divisor == 0)
                    dividedNums++
            }
            if (dividedNums > maxDividedNums) {
                maxDividedNums = dividedNums
                maxDivisor = divisor
            }
            if (dividedNums == maxDividedNums && divisor < maxDivisor)
                maxDivisor = divisor
        }
        return maxDivisor
    }
}
