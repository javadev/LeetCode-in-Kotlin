package g1701_1800.s1723_find_minimum_time_to_finish_all_jobs

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
class Solution {
    private var min = Int.MAX_VALUE
    fun minimumTimeRequired(jobs: IntArray, k: Int): Int {
        backtraking(jobs, jobs.size - 1, IntArray(k))
        return min
    }

    private fun backtraking(jobs: IntArray, j: Int, sum: IntArray) {
        val max = getMax(sum)
        if (max >= min) {
            return
        }
        if (j < 0) {
            min = max
            return
        }
        for (i in sum.indices) {
            if (i > 0 && sum[i] == sum[i - 1]) {
                continue
            }
            sum[i] += jobs[j]
            backtraking(jobs, j - 1, sum)
            sum[i] -= jobs[j]
        }
    }

    private fun getMax(sum: IntArray): Int {
        var max = Int.MIN_VALUE
        for (j in sum) {
            max = Math.max(max, j)
        }
        return max
    }
}
