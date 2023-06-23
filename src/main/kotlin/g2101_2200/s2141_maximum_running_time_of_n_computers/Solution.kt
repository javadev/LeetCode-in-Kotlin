package g2101_2200.s2141_maximum_running_time_of_n_computers

// #Hard #Array #Sorting #Greedy #Binary_Search
class Solution {
    private fun isPossibeToRun(n: Int, batteries: IntArray, avgTime: Long): Boolean {
        var duration: Long = 0
        for (ele in batteries) {
            duration += Math.min(ele.toLong(), avgTime)
        }
        return avgTime * n <= duration
    }

    fun maxRunTime(n: Int, batteries: IntArray): Long {
        var startTime: Long = 0
        var sum: Long = 0
        var ans: Long = 0
        for (ele in batteries) {
            sum += ele
        }
        var endTime = sum
        while (startTime <= endTime) {
            val avgTime = (startTime + endTime) / 2
            if (isPossibeToRun(n, batteries, avgTime)) {
                ans = avgTime
                startTime = avgTime + 1
            } else {
                endTime = avgTime - 1
            }
        }
        return ans
    }
}
