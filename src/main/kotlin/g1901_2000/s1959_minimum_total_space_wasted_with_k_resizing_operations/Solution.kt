package g1901_2000.s1959_minimum_total_space_wasted_with_k_resizing_operations

// #Medium #Array #Dynamic_Programming #2023_06_21_Time_225_ms_(100.00%)_Space_36.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minSpaceWastedKResizing(arr: IntArray, k: Int): Int {
        var k = k
        val n = arr.size
        k++
        val dp = Array(n) { IntArray(k + 1) }
        for (j in 1..k) {
            for (i in n - 1 downTo 0) {
                val ele = n - i
                if (j == ele) {
                    dp[i][j] = 0
                    continue
                }
                if (j == 1) {
                    var sum = 0
                    var maxEle = -1
                    for (l in i until n) {
                        maxEle = Math.max(maxEle, arr[l])
                        sum += arr[l]
                    }
                    dp[i][j] = maxEle * (n - i) - sum
                    continue
                }
                var maxEle = -1
                var sum = 0
                var ans = Int.MAX_VALUE
                for (cut in i..n - j) {
                    maxEle = Math.max(maxEle, arr[cut])
                    sum += arr[cut]
                    val recAns = dp[cut + 1][j - 1]
                    val myAns = maxEle * (cut - i + 1) - sum
                    ans = Math.min(ans, recAns + myAns)
                }
                dp[i][j] = ans
            }
        }
        return dp[0][k]
    }
}
