package g2901_3000.s2924_find_champion_ii

// #Medium #Graph #2023_12_31_Time_724_ms_(6.98%)_Space_45.3_MB_(97.67%)

class Solution {
    fun findChampion(n: Int, edges: Array<IntArray>): Int {
        val arr = IntArray(n)
        for (adj in edges) {
            arr[adj[1]]++
        }
        var cnt = 0
        var ans = -1
        for (i in 0 until n) {
            if (arr[i] == 0) {
                cnt++
                ans = i
            }
        }
        return if (cnt == 1) {
            ans
        } else {
            -1
        }
    }
}
