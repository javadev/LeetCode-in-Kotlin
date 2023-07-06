package g2501_2600.s2555_maximize_win_from_two_segments

// #Medium #Array #Binary_Search #Sliding_Window
// #2023_07_06_Time_388_ms_(100.00%)_Space_50.2_MB_(100.00%)

class Solution {
    fun maximizeWin(p: IntArray, k: Int): Int {
        val n = p.size
        if (p[n - 1] - p[0] <= 2 * k) {
            return n
        }
        // segment ending in pre[j]
        val pre = IntArray(n)
        // segment starting in post[i]
        val post = IntArray(n)
        var i = 0
        var max = 0
        var j = 0
        while (j < n) {
            if (p[j] - p[i] > k) {
                i++
            }
            max = Math.max(max, j - i + 1)
            pre[j] = max
            j++
        }
        max = 0
        j = n - 1
        i = n - 1
        while (i >= 0) {
            if (p[j] - p[i] > k) {
                j--
            }
            max = Math.max(max, j - i + 1)
            post[i] = max
            i--
        }
        var res = 0
        var b = 0
        while (b + 1 < n) {
            res = Math.max(res, pre[b] + post[b + 1])
            b++
        }
        return res
    }
}
