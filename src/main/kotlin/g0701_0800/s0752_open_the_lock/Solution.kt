package g0701_0800.s0752_open_the_lock

// #Medium #Array #String #Hash_Table #Breadth_First_Search
// #Graph_Theory_I_Day_12_Breadth_First_Search
// #2023_03_06_Time_310_ms_(100.00%)_Space_37.6_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun openLock(deadEnds: Array<String>, target: String): Int {
        val visited: MutableSet<Int> = HashSet()
        for (end in deadEnds) {
            visited.add(end.toInt())
        }
        if (visited.contains(0)) {
            return -1
        }
        val queue: Queue<IntArray> = LinkedList()
        queue.add(intArrayOf(0, 0))
        visited.add(0)
        val numTarget = target.toInt()
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            val number = node[0]
            val dist = node[1]
            if (number == numTarget) {
                return dist
            }
            val neighbors = getNeighbors(number)
            for (neighbor in neighbors) {
                if (visited.contains(neighbor)) {
                    continue
                }
                visited.add(neighbor)
                queue.add(intArrayOf(neighbor, dist + 1))
            }
        }
        return -1
    }

    private fun getNeighbors(number: Int): IntArray {
        val neighbors = IntArray(8)
        var index = 0
        var ten = 10
        for (i in 1..4) {
            neighbors[index++] = number / ten * ten + (number + ten / 10) % ten
            neighbors[index++] = number / ten * ten + (number + 9 * (ten / 10)) % ten
            ten *= 10
        }
        return neighbors
    }
}
