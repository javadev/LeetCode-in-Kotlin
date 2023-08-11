package g2101_2200.s2141_maximum_running_time_of_n_computers

// #Hard #Array #Sorting #Greedy #Binary_Search

class Solution {
    fun maxRunTime(n: Int, batteries: IntArray): Long {
        var sumbatt: Long = 0
        for (x in batteries) sumbatt += x.toLong()
        var l: Long = 0
        var r = sumbatt / n
        var res = Long.MIN_VALUE
        while (l <= r) {
            val mid = (l + r) / 2
            if (isPossible(mid, n, batteries)) {
                res = mid
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return res
    }

    private fun isPossible(mid: Long, n: Int, b: IntArray): Boolean {
        var sum: Long = 0
        for (x in b) sum += Math.min(x.toLong(), mid)
        return n * mid <= sum
    }
}
