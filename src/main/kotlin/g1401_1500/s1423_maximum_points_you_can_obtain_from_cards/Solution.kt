package g1401_1500.s1423_maximum_points_you_can_obtain_from_cards

// #Medium #Array #Prefix_Sum #Sliding_Window
// #2023_06_07_Time_349_ms_(78.57%)_Space_53.3_MB_(64.29%)

class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        var currSum = 0
        var maxSum: Int
        for (i in 0 until k) {
            currSum += cardPoints[i]
        }
        if (k == cardPoints.size) {
            return currSum
        }
        maxSum = currSum
        var r = cardPoints.size - 1
        while (r >= cardPoints.size - k) {
            currSum += cardPoints[r] - cardPoints[k + r - cardPoints.size]
            maxSum = Math.max(currSum, maxSum)
            r--
        }
        return maxSum
    }
}
