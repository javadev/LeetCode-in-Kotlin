package g2301_2400.s2350_shortest_impossible_sequence_of_rolls

import java.util.BitSet

// #Hard #Array #Hash_Table #Greedy
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
