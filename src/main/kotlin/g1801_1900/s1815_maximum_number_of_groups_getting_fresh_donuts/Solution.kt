package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2023_06_20_Time_1073_ms_(100.00%)_Space_71.3_MB_(100.00%)

import java.util.Objects

class Solution {
    inner class Data(var idx: Int, var arrHash: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }
            if (other == null || javaClass != other.javaClass) {
                return false
            }
            val data = other as Data
            return idx == data.idx && arrHash == data.arrHash
        }

        override fun hashCode(): Int {
            return Objects.hash(idx, arrHash)
        }
    }

    private var dp: HashMap<Data, Int> = HashMap()
    fun maxHappyGroups(batchSize: Int, groups: IntArray): Int {
        val arr = IntArray(batchSize)
        for (group in groups) {
            arr[group % batchSize]++
        }
        return arr[0] + solve(0, arr)
    }

    private fun solve(num: Int, arr: IntArray): Int {
        if (isFull(arr)) {
            return 0
        }
        val key = Data(num, arr.contentHashCode())
        if (dp.containsKey(key)) {
            return dp[key]!!
        }
        var best = Int.MIN_VALUE / 2
        if (num == 0) {
            for (i in 1 until arr.size) {
                if (arr[i] <= 0) {
                    continue
                }
                arr[i]--
                best = Math.max(best, 1 + solve(i, arr))
                arr[i]++
            }
        } else {
            for (i in 1 until arr.size) {
                if (arr[i] > 0) {
                    arr[i]--
                    best = best.coerceAtLeast(solve((num + i) % arr.size, arr))
                    arr[i]++
                }
            }
        }
        dp[key] = best
        return best
    }

    private fun isFull(arr: IntArray): Boolean {
        var sum = 0
        for (i in 1 until arr.size) {
            sum += arr[i]
        }
        return sum == 0
    }
}
