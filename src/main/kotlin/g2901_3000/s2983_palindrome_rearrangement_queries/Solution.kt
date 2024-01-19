package g2901_3000.s2983_palindrome_rearrangement_queries

// #Hard #String #Hash_Table #Prefix_Sum #2024_01_19_Time_905_ms_(87.50%)_Space_131.9_MB_(37.50%)

class Solution {
    private var n = 0

    // get associated index in the other half
    private fun opp(i: Int): Int {
        return n - 1 - i
    }

    fun canMakePalindromeQueries(s: String, queries: Array<IntArray>): BooleanArray {
        val fq = IntArray(26)
        val m = queries.size
        val ret = BooleanArray(m)
        n = s.length
        // check that both halves contain the same letters
        for (i in 0 until n / 2) {
            fq[s[i].code - 'a'.code]++
        }
        for (i in n / 2 until n) {
            fq[s[i].code - 'a'.code]--
        }
        for (em in fq) {
            if (em != 0) {
                return ret
            }
        }
        // find the first and the last characters in the first half
        // that do not match with their associated character in
        // the second half
        var problemPoint = -1
        var lastProblem = -1
        for (i in 0 until n / 2) {
            if (s[i] != s[opp(i)]) {
                if (problemPoint == -1) {
                    problemPoint = i
                }
                lastProblem = i
            }
        }
        // if already a palindrome
        if (problemPoint == -1) {
            ret.fill(true)
            return ret
        }
        // the idea is that at least one of the intervals in the
        // query has to cover the first pair of different characters.
        // But depending on how far the other end of that interval
        // goes, the requirements for the other interval are lessened
        val dpFirst = IntArray(n / 2 + 1)
        val dpSecond = IntArray(n + 1)
        dpFirst.fill(-1)
        dpSecond.fill(-1)
        // assuming the first interval covers the first problem,
        // and then extends to the right
        var rptr = opp(problemPoint)
        val mp: MutableMap<Char, Int> = HashMap()
        for (i in problemPoint until n / 2) {
            mp.compute(s[i]) { _: Char?, v: Int? -> if (v == null) 1 else v + 1 }
            // the burden for the left end of the second interval does not change;
            // it needs to go at least until the last problematic match. But the
            // requirements for the right end do. If we can rearrange the characters
            // in the left half to match the right end of the right interval, this
            // means we do not need the right end of the right interval to go too far
            while (mp.containsKey(s[rptr]) ||
                (rptr >= n / 2 && s[rptr] == s[opp(rptr)] && mp.isEmpty())
            ) {
                mp.computeIfPresent(s[rptr]) { _: Char?, v: Int -> if (v == 1) null else v - 1 }
                rptr--
            }
            dpFirst[i] = rptr
        }
        // mirrored discussion assuming it is the right interval that takes
        // care of the first problematic pair
        var lptr = problemPoint
        mp.clear()
        for (i in opp(problemPoint) downTo n / 2) {
            mp.compute(s[i]) { _: Char?, v: Int? -> if (v == null) 1 else v + 1 }
            while (mp.containsKey(s[lptr]) ||
                (lptr < n / 2 && s[lptr] == s[opp(lptr)] && mp.isEmpty())
            ) {
                mp.computeIfPresent(s[lptr]) { _: Char?, v: Int -> if (v == 1) null else v - 1 }
                lptr++
            }
            dpSecond[i] = lptr
        }
        for (i in 0 until m) {
            val a = queries[i][0]
            val b = queries[i][1]
            val c = queries[i][2]
            val d = queries[i][3]
            // if either interval the problematic interval on its side, it does not matter
            // what happens with the other interval
            if (a <= problemPoint && b >= lastProblem ||
                c <= opp(lastProblem) && d >= opp(problemPoint)
            ) {
                ret[i] = true
                continue
            }
            // if the left interval covers the first problem, we use
            // dp to figure out if the right one is large enough
            if (a <= problemPoint && b >= problemPoint && d >= dpFirst[b] && c <= opp(lastProblem)) {
                ret[i] = true
            }
            // similarly for the case where the right interval covers
            // the first problem
            if (d >= opp(problemPoint) && c <= opp(problemPoint) && a <= dpSecond[c] && b >= lastProblem) {
                ret[i] = true
            }
        }
        return ret
    }
}
