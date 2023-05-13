package g0901_1000.s0997_find_the_town_judge

// #Easy #Array #Hash_Table #Graph #Data_Structure_II_Day_19_Graph
// #Graph_Theory_I_Day_13_Graph_Theory #2023_05_13_Time_475_ms_(58.62%)_Space_121.1_MB_(34.48%)

class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val count = IntArray(n + 1)
        for (t in trust) {
            --count[t[0]]
            ++count[t[1]]
        }
        for (i in 1 until n + 1) if (count[i] == n - 1) return i
        return -1
    }
}
