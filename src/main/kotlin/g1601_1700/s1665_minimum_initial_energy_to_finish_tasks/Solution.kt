package g1601_1700.s1665_minimum_initial_energy_to_finish_tasks

// #Hard #Array #Sorting #Greedy #2023_06_15_Time_823_ms_(100.00%)_Space_114.6_MB_(100.00%)

class Solution {
    fun minimumEffort(tasks: Array<IntArray>): Int {
        tasks.sortWith { a: IntArray, b: IntArray -> a[1] - a[0] - b[1] + b[0] }
        var prev = 0
        for (item in tasks) {
            prev = Math.max(prev + item[0], item[1])
        }
        return prev
    }
}
