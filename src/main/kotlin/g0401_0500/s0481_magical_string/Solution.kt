package g0401_0500.s0481_magical_string

// #Medium #String #Two_Pointers #2023_01_02_Time_124_ms_(100.00%)_Space_34.3_MB_(100.00%)

class Solution {
    fun magicalString(n: Int): Int {
        val a = IntArray(n + 2)
        var fast = 1
        var slow = 1
        var num = 1
        while (fast <= n) {
            a[fast++] = num
            if (a[slow++] == 2) {
                a[fast++] = num
            }
            num = 3 - num
        }
        var count = 0
        for (j in 1..n) {
            if (a[j] == 1) {
                count++
            }
        }
        return count
    }
}
