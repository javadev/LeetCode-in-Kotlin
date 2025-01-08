package g3401_3500.s3412_find_mirror_score_of_a_string

// #Medium #String #Hash_Table #Stack #Simulation #2025_01_07_Time_17_(96.15%)_Space_40.02_(80.77%)

class Solution {
    fun calculateScore(s: String): Long {
        val n = s.length
        val st: Array<ArrayList<Int>> = Array<ArrayList<Int>>(26) { ArrayList<Int>() }
        var r: Long = 0
        for (i in 0..<n) {
            val mc = 'z'.code - (s[i].code - 'a'.code)
            val p = mc - 'a'.code
            if (st[p].isNotEmpty()) {
                r += (i - st[p].removeAt(st[p].size - 1)).toLong()
            } else {
                st[s[i].code - 'a'.code].add(i)
            }
        }
        return r
    }
}
