package g1201_1300.s1203_sort_items_by_groups_respecting_dependencies

// #Hard #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #2023_06_09_Time_503_ms_(100.00%)_Space_56.8_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun sortItems(n: Int, m: Int, group: IntArray, beforeItems: List<List<Int>>): IntArray {
        var totalGroups = m
        val indexGroupMap: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in 0 until n) {
            if (group[i] == -1) {
                group[i] = totalGroups
                indexGroupMap[totalGroups] = ArrayList()
                indexGroupMap[totalGroups]!!.add(i)
                totalGroups++
            } else {
                indexGroupMap.putIfAbsent(group[i], ArrayList())
                indexGroupMap[group[i]]!!.add(i)
            }
        }
        val externalInMap = IntArray(totalGroups)
        val internalInMap = IntArray(n)
        val externalGraph: MutableMap<Int, MutableList<Int>> = HashMap()
        val internalGraph: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in beforeItems.indices) {
            if (beforeItems[i].isNotEmpty()) {
                val groupNumber = group[i]
                for (j in beforeItems[i].indices) {
                    val prevItem = beforeItems[i][j]
                    val prevGroupNumber = group[prevItem]
                    if (groupNumber == prevGroupNumber) {
                        internalGraph.putIfAbsent(prevItem, ArrayList())
                        internalGraph[prevItem]!!.add(i)
                        internalInMap[i]++
                    } else {
                        externalGraph.putIfAbsent(prevGroupNumber, ArrayList())
                        externalGraph[prevGroupNumber]!!.add(groupNumber)
                        externalInMap[groupNumber]++
                    }
                }
            }
        }
        val externalQueue: Queue<Int> = LinkedList()
        for (i in 0 until totalGroups) {
            if (externalInMap[i] == 0) {
                externalQueue.offer(i)
            }
        }
        val res = IntArray(n)
        var resIndex = 0
        while (!externalQueue.isEmpty()) {
            val curGroup = externalQueue.poll()
            val internalQueue: Queue<Int> = LinkedList()
            if (indexGroupMap.containsKey(curGroup)) {
                for (item in indexGroupMap[curGroup]!!) {
                    if (internalInMap[item] == 0) {
                        internalQueue.offer(item)
                    }
                }
            }
            while (!internalQueue.isEmpty()) {
                val curItem = internalQueue.poll()
                res[resIndex] = curItem
                resIndex++
                if (internalGraph.containsKey(curItem)) {
                    for (nextItemInGroup in internalGraph[curItem]!!) {
                        internalInMap[nextItemInGroup]--
                        if (internalInMap[nextItemInGroup] == 0) {
                            internalQueue.offer(nextItemInGroup)
                        }
                    }
                }
            }
            if (externalGraph.containsKey(curGroup)) {
                for (nextGroup in externalGraph[curGroup]!!) {
                    externalInMap[nextGroup]--
                    if (externalInMap[nextGroup] == 0) {
                        externalQueue.offer(nextGroup)
                    }
                }
            }
        }
        return if (resIndex == n) res else intArrayOf()
    }
}
