package g0301_0400.s0396_rotate_function

// #Medium #Array #Dynamic_Programming #Math
// #2022_11_29_Time_562_ms_(87.50%)_Space_49.8_MB_(100.00%)

class Solution {
    fun maxRotateFunction(A: IntArray): Int {
        var s = 0
        var a = 0
        A.mapIndexed { i, it ->
            s = s + (it * i)
            a = a + it
        }
        var m = s
        for (i in A.size - 1 downTo 0) {
            s = s - A[i] * A.size + a
            m = maxOf(s, m)
        }
        return m
    }
}
