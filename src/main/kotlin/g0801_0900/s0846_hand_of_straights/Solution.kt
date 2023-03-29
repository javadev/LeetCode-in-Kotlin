package g0801_0900.s0846_hand_of_straights

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2023_03_29_Time_306_ms_(96.15%)_Space_39.4_MB_(46.15%)

import java.util.Arrays

class Solution {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        val len = hand.size
        if (len % groupSize != 0) {
            return false
        }
        Arrays.sort(hand)
        val map: MutableMap<Int, Int> = HashMap()
        for (num in hand) {
            var cnt = map.getOrDefault(num, 0)
            map[num] = ++cnt
        }
        for (num in hand) {
            var cnt = map[num]!!
            if (cnt <= 0) {
                continue
            }
            map[num] = --cnt
            var loop = 1
            while (loop < groupSize) {
                var curCnt = map.getOrDefault(num + loop, 0)
                if (curCnt <= 0) {
                    return false
                }
                map[num + loop] = --curCnt
                ++loop
            }
        }
        return true
    }
}
