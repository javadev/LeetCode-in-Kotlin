package g2801_2900.s2895_minimum_processing_time

// #Medium #Array #Sorting #Greedy #2023_12_21_Time_662_ms_(80.00%)_Space_69.1_MB_(40.00%)

class Solution {
    fun minProcessingTime(processorTime: List<Int>, tasks: List<Int>): Int {
        val proc = IntArray(processorTime.size)
        run {
            var i = 0
            val n = processorTime.size
            while (i < n) {
                proc[i] = processorTime[i]
                i++
            }
        }
        val jobs = IntArray(tasks.size)
        run {
            var i = 0
            val n = tasks.size
            while (i < n) {
                jobs[i] = tasks[i]
                i++
            }
        }
        proc.sort()
        jobs.sort()
        var maxTime = 0
        var i = 0
        val n = proc.size
        while (i < n) {
            val procTime = proc[i] + jobs[jobs.size - 1 - i * 4]
            if (procTime > maxTime) {
                maxTime = procTime
            }
            i++
        }
        return maxTime
    }
}
