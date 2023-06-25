package g2101_2200.s2106_maximum_fruits_harvested_after_at_most_k_steps

// #Hard #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2023_06_25_Time_816_ms_(100.00%)_Space_107.6_MB_(100.00%)

class Solution {
    fun maxTotalFruits(fruits: Array<IntArray>, startPos: Int, k: Int): Int {
        var res = 0
        var sum = 0
        var left = 0
        for (right in fruits.indices) {
            sum += fruits[right][1]
            while (left <= right && !isValidRange(fruits[left][0], fruits[right][0], startPos, k)) {
                sum -= fruits[left++][1]
            }
            res = Math.max(sum, res)
        }
        return res
    }

    private fun isValidRange(leftPos: Int, rightPos: Int, startPos: Int, k: Int): Boolean {
        val result: Boolean
        result = if (rightPos <= startPos) {
            startPos - leftPos <= k
        } else if (leftPos >= startPos) {
            rightPos - startPos <= k
        } else {
            val left = startPos - leftPos
            val right = rightPos - startPos
            if (left <= right) left * 2 + right <= k else right * 2 + left <= k
        }
        return result
    }
}
