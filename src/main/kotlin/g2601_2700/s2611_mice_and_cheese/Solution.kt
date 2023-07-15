package g2601_2700.s2611_mice_and_cheese

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_07_15_Time_554_ms_(100.00%)_Space_60.7_MB_(66.67%)

import java.util.PriorityQueue

class Solution {
    fun miceAndCheese(firstReward: IntArray, seondReward: IntArray, numberOfTypesOfCheeseForFirstMouse: Int): Int {
        var maximumPoints = 0
        val totalTypesOfCheese = firstReward.size
        val minHeapDifferenceInRewards = PriorityQueue<Int>()
        for (i in 0 until totalTypesOfCheese) {
            maximumPoints += firstReward[i]
            minHeapDifferenceInRewards.add(firstReward[i] - seondReward[i])
            if (minHeapDifferenceInRewards.size > numberOfTypesOfCheeseForFirstMouse) {
                maximumPoints -= minHeapDifferenceInRewards.poll()
            }
        }
        return maximumPoints
    }
}
