package g3801_3900.s3900_longest_balanced_substring_after_one_swap

// #Medium #String #Hash_Table #Prefix_Sum #Staff #Weekly_Contest_497
// #2026_09_17_Time_15_ms_(100.00%)_Space_48.30_MB_(97.14%)

import kotlin.math.min

class Solution {
    fun longestBalanced(s: String): Int {
        val arr = s.toCharArray()
        val n = arr.size
        var bal = n + 1
        var ans = 0
        val nextIndex = IntArray(n)
        val balIndex = IntArray(2 * n + 3)
        balIndex.fill(n + 1)
        for (i in n - 1 downTo 0) {
            bal += (('0'.code xor arr[i].code) shl 1) - 1
            nextIndex[i] = balIndex[bal]
            balIndex[bal] = i
        }
        if (bal == n + 1) {
            return n
        }
        val zeros = (2 * n + 1 - bal) / 2
        val maxLength = 2 * min(zeros, n - zeros)
        var i = 1
        while (i <= n && ans < maxLength) {
            bal += (('1'.code xor arr[i - 1].code) shl 1) - 1
            if (i - balIndex[bal] > ans) {
                ans = i - balIndex[bal]
            }
            if (balIndex[bal - 2] < i - maxLength) {
                balIndex[bal - 2] = nextIndex[balIndex[bal - 2]]
            }
            if (i - balIndex[bal - 2] > ans) {
                ans = i - balIndex[bal - 2]
            }
            if (balIndex[bal + 2] < i - maxLength) {
                balIndex[bal + 2] = nextIndex[balIndex[bal + 2]]
            }
            if (i - balIndex[bal + 2] > ans) {
                ans = i - balIndex[bal + 2]
            }
            i++
        }
        return ans
    }
}
