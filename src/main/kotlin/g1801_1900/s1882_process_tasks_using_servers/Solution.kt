package g1801_1900.s1882_process_tasks_using_servers

import java.util.PriorityQueue

// #Medium #Array #Heap_Priority_Queue
class Solution {
    fun assignTasks(servers: IntArray, tasks: IntArray): IntArray {
        val serverq =
            PriorityQueue { i1: Int, i2: Int -> if (servers[i1] != servers[i2]) servers[i1] - servers[i2] else i1 - i2 }
        for (i in servers.indices) {
            serverq.offer(i)
        }
        val activetaskq = PriorityQueue { i1: IntArray, i2: IntArray -> i1[1] - i2[1] }
        var time = 0
        val res = IntArray(tasks.size)
        for (i in tasks.indices) {
            time = Math.max(time, i)
            while (activetaskq.isNotEmpty() && activetaskq.peek()[1] <= i) {
                val task = activetaskq.poll()
                serverq.offer(task[0])
            }
            if (serverq.isEmpty()) {
                val toptask = activetaskq.peek()
                while (activetaskq.isNotEmpty() && activetaskq.peek()[1] == toptask[1]) {
                    val task = activetaskq.poll()
                    serverq.offer(task[0])
                }
                time = toptask[1]
            }
            val server = serverq.poll()
            res[i] = server
            activetaskq.offer(intArrayOf(server, time + tasks[i]))
        }
        return res
    }
}
