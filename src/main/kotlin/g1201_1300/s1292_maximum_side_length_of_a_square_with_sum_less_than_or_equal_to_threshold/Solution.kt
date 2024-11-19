package g1201_1300.s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold

// #Medium #Array #Binary_Search #Matrix #Prefix_Sum #Binary_Search_II_Day_15
// #2023_06_08_Time_376_ms_(100.00%)_Space_50.6_MB_(100.00%)

class Solution {
    fun maxSideLength(mat: Array<IntArray>, threshold: Int): Int {
        val m = mat.size
        val n = mat[0].size
        val prefix = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i == 0 && j == 0) {
                    prefix[i][j] = mat[i][j]
                } else if (i == 0) {
                    prefix[i][j] = mat[i][j] + prefix[0][j - 1]
                } else if (j == 0) {
                    prefix[i][j] = mat[i][j] + prefix[i - 1][0]
                } else {
                    prefix[i][j] = mat[i][j] + prefix[i][j - 1] + prefix[i - 1][j] - prefix[i - 1][j - 1]
                }
            }
        }
        var low = 1
        var high = Math.min(m, n)
        var ans = 0
        while (low <= high) {
            val mid = (low + high) / 2
            if (min(mid, prefix) > threshold) {
                high = mid - 1
            } else {
                ans = mid
                low = mid + 1
            }
        }
        return ans
    }

    fun min(length: Int, prefix: Array<IntArray>): Int {
        var min = 0
        for (i in length - 1 until prefix.size) {
            for (j in length - 1 until prefix[0].size) {
                min = if (i == length - 1 && j == length - 1) {
                    prefix[i][j]
                } else if (i - length < 0) {
                    Math.min(min, prefix[i][j] - prefix[i][j - length])
                } else if (j - length < 0) {
                    Math.min(min, prefix[i][j] - prefix[i - length][j])
                } else {
                    Math.min(
                        min,
                        (
                            prefix[i][j] -
                                prefix[i][j - length] -
                                prefix[i - length][j]
                            ) +
                            prefix[i - length][j - length],
                    )
                }
            }
        }
        return min
    }
}
