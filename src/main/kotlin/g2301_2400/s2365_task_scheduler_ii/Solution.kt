package g2301_2400.s2365_task_scheduler_ii

// #Medium #Array #Hash_Table #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun taskSchedulerII(tasks: IntArray, space: Int): Long {
        var space = space
        var days: Long = 0
        space++
        val lastOccurence = HashMap<Int, Long>()
        for (i in tasks.indices) {
            if (lastOccurence.containsKey(tasks[i])) {
                val lastTimeOccurred = lastOccurence[tasks[i]]!!
                val daysDifference = days - lastTimeOccurred
                if (daysDifference < space) {
                    days += space - daysDifference
                }
            }
            lastOccurence[tasks[i]] = days
            days++
        }
        return days
    }
}
