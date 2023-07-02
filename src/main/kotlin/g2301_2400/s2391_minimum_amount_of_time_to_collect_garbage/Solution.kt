package g2301_2400.s2391_minimum_amount_of_time_to_collect_garbage

// #Medium #Array #String #Prefix_Sum
class Solution {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        var cTime = 0
        for (str in garbage) {
            cTime += str.length
        }
        val n = travel.size
        for (i in 1 until n) {
            travel[i] += travel[i - 1]
        }
        val mT = getMostTra(garbage, 'M')
        val pT = getMostTra(garbage, 'P')
        val gT = getMostTra(garbage, 'G')
        val m = if (mT <= 0) 0 else travel[mT - 1]
        val p = if (pT <= 0) 0 else travel[pT - 1]
        val g = if (gT <= 0) 0 else travel[gT - 1]
        val tTime = m + p + g
        return cTime + tTime
    }

    private fun getMostTra(garbage: Array<String>, c: Char): Int {
        val n = garbage.size
        for (i in n - 1 downTo 0) {
            if (garbage[i].indexOf(c) != -1) {
                return i
            }
        }
        return -1
    }
}
