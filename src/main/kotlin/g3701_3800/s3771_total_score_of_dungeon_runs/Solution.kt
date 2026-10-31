package g3701_3800.s3771_total_score_of_dungeon_runs

// #Medium #Array #Binary_Search #Prefix_Sum #Staff #Weekly_Contest_479
// #2026_05_07_Time_19_ms_(100.00%)_Space_170.56_MB_(72.37%)

class Solution {
    fun totalScore(hp: Int, damage: IntArray, requirement: IntArray): Long {
        val n = damage.size
        val cumulative = IntArray(n + 1)
        for (i in n - 1 downTo 0) {
            cumulative[i] = cumulative[i + 1] + damage[i]
        }
        var soln: Long = 0
        for (i in n - 1 downTo 0) {
            val adjHP = hp - requirement[i] + cumulative[i + 1]
            if (adjHP >= cumulative[i]) {
                soln += (i - binSearch(cumulative, adjHP, i) + 1).toLong()
            }
        }
        return soln
    }

    private fun binSearch(arr: IntArray, hp: Int, l: Int): Int {
        var l = l
        var h = 0
        while (h < l) {
            val mid = (h + l) ushr 1
            if (arr[mid] > hp) {
                h = mid + 1
            } else {
                l = mid
            }
        }
        return h
    }
}
