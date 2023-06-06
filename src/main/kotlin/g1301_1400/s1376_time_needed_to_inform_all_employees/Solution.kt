package g1301_1400.s1376_time_needed_to_inform_all_employees

import java.util.ArrayDeque
import java.util.Queue

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Programming_Skills_II_Day_11
// #Graph_Theory_I_Day_9_Standard_Traversal
class Solution {
    private class Pair internal constructor(var emp: Int, var time: Int)

    fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
        val map = HashMap<Int, MutableList<Int>>()
        var head = -1
        for (i in manager.indices) {
            if (manager[i] == -1) {
                head = i
                continue
            }
            val man = manager[i]
            map.putIfAbsent(man, ArrayList())
            map[man]!!.add(i)
        }
        var maxtime = 0
        val que: Queue<Pair> = ArrayDeque()
        que.add(Pair(head, informTime[head]))
        while (!que.isEmpty()) {
            val rem = que.remove()
            maxtime = Math.max(rem.time, maxtime)
            if (map.containsKey(rem.emp)) {
                for (under in map[rem.emp]!!) {
                    que.add(Pair(under, rem.time + informTime[under]))
                }
            }
        }
        return maxtime
    }
}
