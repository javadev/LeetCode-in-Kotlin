package g3101_3200.s3180_maximum_total_reward_using_operations_i

// #Medium #Array #Dynamic_Programming #2024_06_15_Time_183_ms_(100.00%)_Space_36.9_MB_(100.00%)

class Solution {
    private fun sortedSet(values: IntArray): IntArray {
        var max = 0
        for (x in values) {
            if (x > max) {
                max = x
            }
        }
        val set = BooleanArray(max + 1)
        var n = 0
        for (x in values) {
            if (!set[x]) {
                set[x] = true
                n++
            }
        }
        val result = IntArray(n)
        for (x in max downTo 1) {
            if (set[x]) {
                result[--n] = x
            }
        }
        return result
    }

    fun maxTotalReward(rewardValues: IntArray): Int {
        var rewardValues = rewardValues
        rewardValues = sortedSet(rewardValues)
        val n = rewardValues.size
        val max = rewardValues[n - 1]
        val isSumPossible = BooleanArray(max)
        isSumPossible[0] = true
        var maxSum = 0
        var last = 1
        for (sum in rewardValues[0] until max) {
            while (last < n && rewardValues[last] <= sum) {
                last++
            }
            val s2 = sum / 2
            for (i in last - 1 downTo 0) {
                val x = rewardValues[i]
                if (x <= s2) {
                    break
                }
                if (isSumPossible[sum - x]) {
                    isSumPossible[sum] = true
                    maxSum = sum
                    break
                }
            }
        }
        return maxSum + max
    }
}
