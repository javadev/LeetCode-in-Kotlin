package g3701_3800.s3709_design_exam_scores_tracker

// #Medium #Array #Binary_Search #Design #Prefix_Sum #Biweekly_Contest_167
// #2025_10_14_Time_126_ms_(78.95%)_Space_159.52_MB_(84.21%)

class ExamTracker {
    private val ti: ArrayList<Int> = ArrayList<Int>()
    private val pr: ArrayList<Long> = ArrayList<Long>()

    fun record(time: Int, score: Int) {
        ti.add(time)
        val pv = (if (pr.isEmpty()) 0L else pr[pr.size - 1])
        pr.add(pv + score)
    }

    fun totalScore(startTime: Int, endTime: Int): Long {
        val n = ti.size
        if (n == 0) {
            return 0L
        }
        val l = lB(startTime)
        val rE = fGt(endTime)
        val r = rE - 1
        if (l > r) {
            return 0L
        }
        val sR = pr[r]
        val sL = (if (l > 0) pr[l - 1] else 0L)
        return sR - sL
    }

    private fun lB(t: Int): Int {
        var l = 0
        var r = ti.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (ti[m] < t) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l
    }

    private fun fGt(t: Int): Int {
        var l = 0
        var r = ti.size
        while (l < r) {
            val m = (l + r) ushr 1
            if (ti[m] <= t) {
                l = m + 1
            } else {
                r = m
            }
        }
        return l
    }
}

/*
 * Your ExamTracker object will be instantiated and called as such:
 * var obj = ExamTracker()
 * obj.record(time,score)
 * var param_2 = obj.totalScore(startTime,endTime)
 */
