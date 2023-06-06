package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended

// #Medium #Array #Greedy #Heap_Priority_Queue
class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        events.sortWith(Comparator.comparingInt { e: IntArray -> e[1] })
        val root = IntArray(events[events.size - 1][1] + 2)
        for (i in 1 until root.size) {
            root[i] = i
        }
        var res = 0
        for (e in events) {
            val nxtAvailable = find(root, e[0])
            if (nxtAvailable <= e[1]) {
                res++
                root[nxtAvailable] = find(root, nxtAvailable + 1)
            }
        }
        return res
    }

    private fun find(root: IntArray, i: Int): Int {
        if (root[i] != i) {
            root[i] = find(root, root[i])
            return root[i]
        }
        return i
    }
}
