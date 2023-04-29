package g0901_1000.s0936_stamping_the_sequence

// #Hard #String #Greedy #Stack #Queue #2023_04_28_Time_196_ms_(100.00%)_Space_40.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun movesToStamp(stamp: String, target: String): IntArray {
        val moves: MutableList<Int> = ArrayList()
        val s = stamp.toCharArray()
        val t = target.toCharArray()
        var stars = 0
        val visited = BooleanArray(target.length)
        while (stars < target.length) {
            var doneReplace = false
            for (i in 0..target.length - stamp.length) {
                if (!visited[i] && canReplace(t, i, s)) {
                    stars = doReplace(t, i, s, stars)
                    doneReplace = true
                    visited[i] = true
                    moves.add(i)
                    if (stars == t.size) {
                        break
                    }
                }
            }
            if (!doneReplace) {
                return IntArray(0)
            }
        }
        val result = IntArray(moves.size)
        for (i in moves.indices) {
            result[i] = moves[moves.size - i - 1]
        }
        return result
    }

    private fun canReplace(t: CharArray, i: Int, s: CharArray): Boolean {
        for (j in s.indices) {
            if (t[i + j] != '*' && t[i + j] != s[j]) {
                return false
            }
        }
        return true
    }

    private fun doReplace(t: CharArray, i: Int, s: CharArray, stars: Int): Int {
        var stars = stars
        for (j in s.indices) {
            if (t[i + j] != '*') {
                t[i + j] = '*'
                stars++
            }
        }
        return stars
    }
}
