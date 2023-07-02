package g0401_0500.s0433_minimum_genetic_mutation

// #Medium #String #Hash_Table #Breadth_First_Search #Graph_Theory_I_Day_12_Breadth_First_Search
// #2022_12_21_Time_204_ms_(82.08%)_Space_34.5_MB_(82.08%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private fun isInBank(set: Set<String>, cur: String): List<String> {
        val res: MutableList<String> = ArrayList()
        for (each in set) {
            var diff = 0
            for (i in 0 until each.length) {
                if (each[i] != cur[i]) {
                    diff++
                    if (diff > 1) {
                        break
                    }
                }
            }
            if (diff == 1) {
                res.add(each)
            }
        }
        return res
    }

    fun minMutation(start: String, end: String, bank: Array<String>): Int {
        val set: MutableSet<String> = HashSet()
        for (s in bank) {
            set.add(s)
        }
        val queue: Queue<String> = LinkedList()
        queue.offer(start)
        var step = 0
        while (queue.isNotEmpty()) {
            var curSize = queue.size
            while (curSize-- > 0) {
                val cur = queue.poll()
                if (cur == end) {
                    return step
                }
                for (next in isInBank(set, cur)) {
                    queue.offer(next)
                    set.remove(next)
                }
            }
            step++
        }
        return -1
    }
}
