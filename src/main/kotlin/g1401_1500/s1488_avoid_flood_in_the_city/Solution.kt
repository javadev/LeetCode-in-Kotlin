package g1401_1500.s1488_avoid_flood_in_the_city

import java.util.TreeSet

// #Medium #Array #Hash_Table #Greedy #Binary_Search #Heap_Priority_Queue #Binary_Search_II_Day_18
class Solution {
    fun avoidFlood(rains: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        val tree = TreeSet<Int>()
        val ans = IntArray(rains.size)
        var i = 0
        while (i < rains.size) {
            val `val` = rains[i]
            if (`val` != 0) {
                if (hm.containsKey(`val`)) {
                    val mapVal = hm[`val`]!!
                    if (tree.ceiling(mapVal) != null) {
                        ans[tree.ceiling(mapVal)] = `val`
                        hm[`val`] = i
                        tree.remove(tree.ceiling(mapVal))
                    } else {
                        return IntArray(0)
                    }
                } else {
                    hm[`val`] = i
                }
                ans[i] = -1
            } else {
                tree.add(i)
            }
            i = i + 1
        }
        for (tr in tree) {
            ans[tr] = 1
        }
        return ans
    }
}
