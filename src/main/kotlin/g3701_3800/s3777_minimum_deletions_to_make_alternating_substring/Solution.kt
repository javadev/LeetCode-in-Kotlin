package g3701_3800.s3777_minimum_deletions_to_make_alternating_substring

// #Hard #String #Segment_Tree #Senior_Staff #Weekly_Contest_480
// #2026_05_06_Time_35_ms_(100.00%)_Space_247.99_MB_(90.00%)

class Solution {
    private lateinit var f: IntArray
    private var n = 0

    private fun add(i: Int, v: Int) {
        var i = i
        i++
        while (i <= n) {
            f[i] += v
            i += i and -i
        }
    }

    private fun sum(i: Int): Int {
        var i = i
        var s = 0
        i++
        while (i > 0) {
            s += f[i]
            i -= i and -i
        }
        return s
    }

    fun minDeletions(s: String, q: Array<IntArray>): IntArray? {
        val a = s.toCharArray()
        n = a.size
        f = IntArray(n + 1)
        var i = 0
        while (i + 1 < n) {
            if (a[i] == a[i + 1]) {
                add(i, 1)
            }
            i++
        }
        val ans = IntArray(q.size)
        var k = 0
        for (e in q) {
            if (e[0] == 1) {
                val j = e[1]
                if (j > 0 && a[j] == a[j - 1]) {
                    add(j - 1, -1)
                }
                if (j + 1 < n && a[j] == a[j + 1]) {
                    add(j, -1)
                }
                a[j] = if (a[j] == 'A') 'B' else 'A'
                if (j > 0 && a[j] == a[j - 1]) {
                    add(j - 1, 1)
                }
                if (j + 1 < n && a[j] == a[j + 1]) {
                    add(j, 1)
                }
            } else {
                val l = e[1]
                val r = e[2]
                ans[k++] = if (l < r) sum(r - 1) - sum(l - 1) else 0
            }
        }
        return ans.copyOf(k)
    }
}
