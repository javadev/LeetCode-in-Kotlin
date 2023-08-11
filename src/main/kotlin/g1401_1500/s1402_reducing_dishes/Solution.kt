package g1401_1500.s1402_reducing_dishes

// #Hard #Array #Dynamic_Programming #Sorting #Greedy
// #2023_06_07_Time_151_ms_(100.00%)_Space_36.6_MB_(85.71%)

class Solution {
    fun maxSatisfaction(satisfaction: IntArray): Int {
        satisfaction.sort()
        var sum = 0
        var mulSum = 0
        for (i in satisfaction.indices) {
            sum += satisfaction[i]
            mulSum += (i + 1) * satisfaction[i]
        }
        var maxVal = Math.max(0, mulSum)
        for (j in satisfaction) {
            mulSum -= sum
            sum -= j
            maxVal = Math.max(maxVal, mulSum)
        }
        return maxVal
    }
}
