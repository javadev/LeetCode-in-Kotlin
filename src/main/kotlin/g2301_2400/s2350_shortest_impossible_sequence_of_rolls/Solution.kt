package g2301_2400.s2350_shortest_impossible_sequence_of_rolls

// #Hard #Array #Hash_Table #Greedy #2023_07_01_Time_495_ms_(100.00%)_Space_51.4_MB_(100.00%)

import java.util.BitSet

class Solution {
    fun shortestSequence(rolls: IntArray, k: Int): Int {
        val bitSet = BitSet(k + 1)
        var cnt = 0
        var res = 1
        for (roll in rolls) {
            if (!bitSet[roll]) {
                bitSet.set(roll)
                cnt++
            }
            if (cnt == k) {
                res++
                cnt = 0
                bitSet.clear()
            }
        }
        return res
    }
}
