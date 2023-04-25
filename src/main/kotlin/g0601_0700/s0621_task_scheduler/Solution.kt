package g0601_0700.s0621_task_scheduler

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting #Level_2_Day_5_Greedy
// #2023_02_06_Time_266_ms_(98.36%)_Space_39.2_MB_(62.30%)

class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        if (n <= 0) {
            return tasks.size
        }
        val counters = IntArray(26)
        var maxCount = 0
        for (task in tasks) {
            val idx = task.code - 'A'.code
            counters[idx]++
            maxCount = Math.max(maxCount, counters[idx])
        }
        var maxNum = 0
        for (counter in counters) {
            if (counter == maxCount) {
                maxNum++
            }
        }
        return Math.max(tasks.size, (maxCount - 1) * (n + 1) + maxNum)
    }
}
