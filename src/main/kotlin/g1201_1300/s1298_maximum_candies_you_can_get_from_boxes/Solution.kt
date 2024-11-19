package g1201_1300.s1298_maximum_candies_you_can_get_from_boxes

// #Hard #Array #Breadth_First_Search #2023_06_08_Time_442_ms_(80.00%)_Space_57.5_MB_(40.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun maxCandies(
        status: IntArray,
        candies: IntArray,
        keys: Array<IntArray>,
        containedBoxes: Array<IntArray>,
        initialBoxes: IntArray,
    ): Int {
        var collectedCandies = 0
        val boxes: Queue<Int> = LinkedList()
        for (box in initialBoxes) {
            boxes.offer(box)
        }
        var unseen = 0
        while (boxes.isNotEmpty()) {
            if (unseen == boxes.size) {
                break
            }
            val curBox = boxes.poll()
            if (status[curBox] == 0) {
                unseen++
                boxes.offer(curBox)
            } else {
                unseen = 0
                // collect candies
                collectedCandies += candies[curBox]
                // open keys
                for (key in keys[curBox]) {
                    status[key] = 1
                }
                // collect contained boxes
                for (box in containedBoxes[curBox]) {
                    boxes.offer(box)
                }
            }
        }
        return collectedCandies
    }
}
