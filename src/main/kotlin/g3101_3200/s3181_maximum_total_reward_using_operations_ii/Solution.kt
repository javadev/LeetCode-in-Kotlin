package g3101_3200.s3181_maximum_total_reward_using_operations_ii

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2024_06_15_Time_376_ms_(100.00%)_Space_67.5_MB_(12.50%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxTotalReward(rewardValues: IntArray): Int {
        var max = rewardValues[0]
        var n = 0
        for (i in 1 until rewardValues.size) {
            max = max(max, rewardValues[i])
        }
        val vis = BooleanArray(max + 1)
        for (i in rewardValues) {
            if (!vis[i]) {
                n++
                vis[i] = true
            }
        }
        val rew = IntArray(n)
        var j = 0
        for (i in 0..max) {
            if (vis[i]) {
                rew[j++] = i
            }
        }
        return rew[n - 1] + getAns(rew, n - 1, rew[n - 1] - 1)
    }

    private fun getAns(rewards: IntArray, i: Int, validLimit: Int): Int {
        var res = 0
        var j = nextElemWithinLimits(rewards, i - 1, validLimit)
        while (j >= 0) {
            if (res >= rewards[j] + min((validLimit - rewards[j]), (rewards[j] - 1))) {
                break
            }
            res = max(
                res,
                (
                    rewards[j] +
                        getAns(
                            rewards,
                            j,
                            min((validLimit - rewards[j]), (rewards[j] - 1)),
                        )
                    ),
            )
            j--
        }
        return res
    }

    private fun nextElemWithinLimits(rewards: IntArray, h: Int, k: Int): Int {
        var h = h
        var l = 0
        var resInd = -1
        while (l <= h) {
            val m = (l + h) / 2
            if (rewards[m] <= k) {
                resInd = m
                l = m + 1
            } else {
                h = m - 1
            }
        }
        return resInd
    }
}
