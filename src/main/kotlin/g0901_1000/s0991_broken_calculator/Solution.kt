package g0901_1000.s0991_broken_calculator

// #Medium #Math #Greedy #2023_05_11_Time_127_ms_(100.00%)_Space_33.9_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun brokenCalc(startValue: Int, target: Int): Int {
        var target = target
        var result = 0
        while (startValue != target) {
            if (target > startValue && target % 2 != 0) {
                target += 1
                result++
            } else if (target > startValue) {
                target /= 2
                result++
            } else {
                result += startValue - target
                break
            }
        }
        return result
    }
}
