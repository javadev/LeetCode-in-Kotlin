package g1401_1500.s1449_form_largest_integer_with_digits_that_add_up_to_target

// #Hard #Array #Dynamic_Programming #2023_06_07_Time_201_ms_(100.00%)_Space_38.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun largestNumber(cost: IntArray, target: Int): String {
        var target = target
        val dp = Array(10) { IntArray(5001) }
        dp[0].fill(-1)
        for (i in 1..cost.size) {
            for (j in 1..target) {
                if (cost[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j]
                } else {
                    var temp = if (dp[i - 1][j - cost[i - 1]] == -1) -1 else 1 + dp[i - 1][j - cost[i - 1]]
                    val t = if (dp[i][j - cost[i - 1]] == -1) -1 else 1 + dp[i][j - cost[i - 1]]
                    temp = if (t != -1 && temp == -1) {
                        t
                    } else {
                        Math.max(t, temp)
                    }
                    if (dp[i - 1][j] == -1) {
                        dp[i][j] = temp
                    } else if (temp == -1) {
                        dp[i][j] = dp[i - 1][j]
                    } else {
                        dp[i][j] = Math.max(temp, dp[i - 1][j])
                    }
                }
            }
        }
        if (dp[9][target] == -1) {
            return "0"
        }
        var i = 9
        val result = StringBuilder()
        while (target > 0) {
            if (target - cost[i - 1] >= 0 && dp[i][target - cost[i - 1]] + 1 == dp[i][target] ||
                (
                    target - cost[i - 1] >= 0 &&
                        dp[i - 1][target - cost[i - 1]] + 1 == dp[i][target]
                    )
            ) {
                result.append(i)
                target -= cost[i - 1]
            } else {
                i--
            }
        }
        return result.toString()
    }
}
