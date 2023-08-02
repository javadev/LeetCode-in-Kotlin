package g1401_1500.s1488_avoid_flood_in_the_city

// #Medium #Array #Hash_Table #Greedy #Binary_Search #Heap_Priority_Queue #Binary_Search_II_Day_18
// #2023_06_13_Time_823_ms_(66.67%)_Space_62.7_MB_(33.33%)

import java.util.TreeSet

class Solution {
    fun avoidFlood(rains: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        val tree = TreeSet<Int>()
        val ans = IntArray(rains.size)
        var i = 0
        while (i < rains.size) {
            val rain = rains[i]
            if (rain != 0) {
                if (hm.containsKey(rain)) {
                    val mapVal = hm[rain]!!
                    if (tree.ceiling(mapVal) != null) {
                        ans[tree.ceiling(mapVal)] = rain
                        hm[rain] = i
                        tree.remove(tree.ceiling(mapVal))
                    } else {
                        return IntArray(0)
                    }
                } else {
                    hm[rain] = i
                }
                ans[i] = -1
            } else {
                tree.add(i)
            }
            i += 1
        }
        for (tr in tree) {
            ans[tr] = 1
        }
        return ans
    }
}
