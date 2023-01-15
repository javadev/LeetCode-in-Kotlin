package g0501_0600.s0528_random_pick_with_weight

// #Medium #Math #Binary_Search #Prefix_Sum #Randomized #Binary_Search_II_Day_13
// #2023_01_15_Time_393_ms_(91.38%)_Space_47_MB_(98.28%)

import java.util.Random
import java.util.TreeMap

class Solution(val w: IntArray) {

    var x: IntArray = IntArray(w.size) { 0 }
    val rand = Random()
    val tree = TreeMap<Int, Int>()
    var sum = 0

    init {
        for (i in w.indices) {
            tree.put(sum, i)
            sum += w[i]
        }
    }

    fun pickIndex(): Int {
        val r = rand.nextInt(sum)
        return tree.floorEntry(r).value!!
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */
