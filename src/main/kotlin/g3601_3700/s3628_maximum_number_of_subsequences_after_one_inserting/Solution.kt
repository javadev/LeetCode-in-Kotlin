package g3601_3700.s3628_maximum_number_of_subsequences_after_one_inserting

// #Medium #Weekly_Contest_460 #2025_07_27_Time_13_ms_(100.00%)_Space_48.00_MB_(75.00%)

class Solution {
    fun numOfSubsequences(s: String): Long {
        var tc: Long = 0
        val chs = s.toCharArray()
        for (c in chs) {
            tc += (if (c == 'T') 1 else 0).toLong()
        }
        var ls: Long = 0
        var cs: Long = 0
        var lcf: Long = 0
        var ctf: Long = 0
        var lct: Long = 0
        var ocg: Long = 0
        var tp: Long = 0
        for (curr in chs) {
            val rt = tc - tp
            val cg = ls * rt
            ocg = if (cg > ocg) cg else ocg
            if (curr == 'L') {
                ls++
            } else {
                if (curr == 'C') {
                    cs++
                    lcf += ls
                } else {
                    if (curr == 'T') {
                        lct += lcf
                        ctf += cs
                        tp++
                    }
                }
            }
        }
        val fcg = ls * (tc - tp)
        ocg = if (fcg > ocg) fcg else ocg
        var maxi: Long = 0
        val bo = longArrayOf(lcf, ctf, ocg)
        for (op in bo) {
            maxi = if (op > maxi) op else maxi
        }
        return lct + maxi
    }
}
